package com.google.mlkit.vision.digitalink.recognition.downloading;

import a6.g;
import a6.o;
import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ab;
import com.google.android.gms.internal.mlkit_vision_digital_ink.dt;
import com.google.android.gms.internal.mlkit_vision_digital_ink.f7;
import com.google.android.gms.internal.mlkit_vision_digital_ink.g2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.i;
import com.google.android.gms.internal.mlkit_vision_digital_ink.kl;
import com.google.android.gms.internal.mlkit_vision_digital_ink.kx;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lm;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.s2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.sl;
import com.google.android.gms.internal.mlkit_vision_digital_ink.y5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.y6;
import g5.q;
import j6.l;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class DigitalInkRecognitionFileDependencyManager$DownloadWorker extends Worker {
    public DigitalInkRecognitionFileDependencyManager$DownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final o doWork() {
        boolean z3;
        Context applicationContext = getApplicationContext();
        g inputData = getInputData();
        HashMap hashMap = sl.f14972g;
        String b10 = inputData.b("mddInstanceId");
        kx kxVar = new kx(applicationContext);
        i c10 = sl.c(applicationContext, kxVar);
        ab b11 = f7.b(Executors.newCachedThreadPool());
        dt b12 = sl.b(applicationContext, b10, kxVar, c10, sl.d(b11, c10), b11);
        Object obj = inputData.f274a.get("requiresWifi");
        if (obj instanceof Boolean) {
            z3 = ((Boolean) obj).booleanValue();
        } else {
            z3 = false;
        }
        y5 a10 = y6.a();
        kl t3 = lm.t();
        int i = 1;
        if (true != z3) {
            i = 2;
        }
        t3.b();
        lm.u((lm) t3.f14430v, i);
        a10.e = new s2((lm) t3.i());
        String b13 = inputData.b("fileGroupId");
        if (b13 != null) {
            a10.f15276b = b13;
            y6 b14 = a10.b();
            b12.getClass();
            try {
                n5.o(g2.a(new l(b12, 12, b14)), b12.f14218g).get();
                return o.a();
            } catch (InterruptedException | ExecutionException e) {
                Log.e("MddModelManager", "Download worker future failed.", e);
                return new a6.l();
            }
        }
        q.h("Null groupName");
        return null;
    }
}
