package wa;
import c.d;
import d7.a;
import e7.c;

import com.daren.scraply.MainActivity;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class g6 {
    public static void a(MainActivity mainActivity, a aVar) {
        com.google.android.gms.internal.consent_sdk.w2 w2Var = (com.google.android.gms.internal.consent_sdk.w2) ((com.google.android.gms.internal.consent_sdk.d7) com.google.android.gms.internal.consent_sdk.d(mainActivity).C).zzb();
        Object obj = new Object();
        Object obj2 = new Object();
        c cVar = new c(0, mainActivity, obj, aVar);
        d dVar = new d(obj, 0, aVar);
        synchronized (w2Var.f13591c) {
            w2Var.e = true;
        }
        ((Queue) w2Var.f13592d.f13611f.get()).add(Long.valueOf(System.currentTimeMillis()));
        lw lwVar = w2Var.f13590b;
        lwVar.getClass();
        ((Executor) lwVar.f14645w).execute(new com.google.android.gms.internal.consent_sdk.g7(lwVar, mainActivity, obj2, cVar, dVar, 0));
    }
}
