// IMyAidlInterface.aidl
package com.youzhuan.iot;

import com.youzhuan.iot.AidlIotCallback;

interface AidlIotService{
    void register(AidlIotCallback callback);
    void executor(int action,String param);
}
