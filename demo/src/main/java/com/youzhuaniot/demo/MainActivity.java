package com.youzhuaniot.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.youzhuaniot.aidl.SmartControler;
import com.youzhuaniot.common.utils.JsonUtil;
import com.youzhuaniot.constatnt.YzAction;
import com.youzhuaniot.constatnt.YzDevType;
import com.youzhuaniot.constatnt.YzOrder;
import com.youzhuaniot.entity.VoiceCtrlCmd;

public class MainActivity extends AppCompatActivity {

	private SmartControler mSmartController;
	private Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mSmartController = SmartControler.getInstance();
		mSmartController.bindSmartService(this);
		btn = findViewById(R.id.voice);
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				VoiceCtrlCmd voiceCtrlCmd = new VoiceCtrlCmd();
				voiceCtrlCmd.setDevType(YzDevType.DEV_TYPE_LIGHT);
				voiceCtrlCmd.setOrder(YzOrder.ON);
				mSmartController.doActionByAidl(
						YzAction.ACTION_CTRL_DEV_BY_VOICE, JsonUtil.toJson(voiceCtrlCmd));
			}
		});
	}
}
