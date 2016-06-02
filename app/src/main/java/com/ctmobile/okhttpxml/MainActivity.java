package com.ctmobile.okhttpxml;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.ctmobile.okhttpxml.api.NetworkCalls;
import com.ctmobile.okhttpxml.api.login.response.Body;
import com.ctmobile.okhttpxml.api.login.response.LoginResponse;
import com.ctmobile.okhttpxml.api.login.response.LoginResponseEnvelope;
import com.ctmobile.okhttpxml.api.login.response.Result;
import com.ctmobile.okhttpxml.api.retrieve.response.RetrieveResponseEnvelope;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView txt;


    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        
        callLogin();
        
    }

    private void callLogin() {
        NetworkCalls.login(new NetworkCalls.SFCallback<LoginResponseEnvelope>() {
            @Override
            public void onSuccess(LoginResponseEnvelope response) {
                
                handleLoginResponse(response);
                callRetrieve();

            }

            @Override
            public void onFailure(Throwable t) {
                Toast.makeText(MainActivity.this, "Request error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void callRetrieve() {
        NetworkCalls.retrieve(new NetworkCalls.SFCallback<RetrieveResponseEnvelope>() {
            @Override
            public void onSuccess(RetrieveResponseEnvelope response) {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Throwable t) {
                Toast.makeText(MainActivity.this, "Request error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void handleLoginResponse(LoginResponseEnvelope envelope) {

        Body loginBody = envelope.getBody();
        LoginResponse loginResponse = loginBody.getLoginResponse();
        Result loginResponseResult = loginResponse.getResult();
        if (loginResponseResult != null) {
            String s = loginResponseResult.toString();
            Log.d(TAG, "onResponse: " + s);
            txt.setText(s);

        }
    }
    
    
    
}
