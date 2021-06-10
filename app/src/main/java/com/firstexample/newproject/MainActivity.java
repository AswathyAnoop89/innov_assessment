package com.firstexample.newproject;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    private RecyclerView courseRV;

    private CourseAdapter adapter;
    private ArrayList<CourseModalNew> courseModalArrayList;


    String url = "http://nats.dev.vs.iinerds.com:8080/api/locations";
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courseRV = findViewById(R.id.idRVCourses);
        progressBar = findViewById(R.id.idPB);

        courseModalArrayList = new ArrayList<>();
        getData();

        buildRecyclerView();
    }
    private void getData() {

        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                progressBar.setVisibility(View.GONE);
                courseRV.setVisibility(View.VISIBLE);
                for (int i = 0; i < response.length(); i++) {

                    try {

                        JSONObject responseObj = response.getJSONObject(i);

                        String id = responseObj.getString("_id");
                        String name =responseObj.getString("name");
                        String lat = responseObj.getString("lat");
                        String lng = responseObj.getString("lng");

                        courseModalArrayList.add(new CourseModalNew(id, name, lat, lng));
                        buildRecyclerView();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "Fail to get the data..", Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(jsonArrayRequest);
    }
    private void buildRecyclerView() {

        adapter = new CourseAdapter(courseModalArrayList, MainActivity.this);

        LinearLayoutManager manager = new
                LinearLayoutManager(this);
        courseRV.setHasFixedSize(true);

        courseRV.setLayoutManager(manager);

        courseRV.setAdapter(adapter);
    }
}