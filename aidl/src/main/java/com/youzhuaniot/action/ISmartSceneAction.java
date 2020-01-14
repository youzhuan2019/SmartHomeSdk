package com.youzhuaniot.action;

public interface ISmartSceneAction extends ISmartAction {
	void getAllScene();
	void execScene(String cmdJson);
}
