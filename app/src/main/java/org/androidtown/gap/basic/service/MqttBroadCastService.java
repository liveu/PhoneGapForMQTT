package org.androidtown.gap.basic.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import org.sidibe.mqtt.android.lib.MqttAndroidClient;
import org.sidibe.mqtt.android.lib.MqttClientState;
import org.sidibe.mqtt.android.lib.MqttMessage;
import org.sidibe.mqtt.android.lib.MqttPushEventListener;

import java.util.List;

/**
 * Created by shchoi on 2015-07-22.
 */
public class MqttBroadCastService extends Service implements MqttPushEventListener{
    private static final int NOTIFICATION_ID = 0x1212;
    private MqttAndroidClient mqttClient;
    public static final String ACTION_PUSH_ARRIVED = "action_push_arrived";
    public static final String ACTION_STATE_CHANGED = "action_state_changed";
    public static final String ACTION_CLIEND_ID = "action_client_id";
    public static final String KEY_CLIENT_ID = "key_client_id";
    public static final String ACTION_PUSH_SEND = "action_push_send";
    public static final String KEY_STATE = "key_state";
    public static final String KEY_DATA = "key_data";
    static final String HOST = "175.126.105.105";
    static final String TOPIC_KEY = "key_topic";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("shchoi", "onStartCommand7777777777777777777777");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        Log.d("shchoi", "onStart7777777777777777777777");
    }

    @Override
    public void onPushMessageReceived(MqttMessage mqttMessage) {

    }

    @Override
    public void onConnectionStateChanged(MqttClientState mqttClientState) {

    }

    @Override
    public void onClientConnectedOnBroker(List<String> list) {

    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
