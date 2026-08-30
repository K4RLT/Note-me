package jb;
import k.a;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c4.s;
import com.daren.scraply.MainActivity;
import com.facebook.ads.AdError;
import ib.o;
import kb.m;
import wa.h8;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i f19106a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f19107b;

    public e(i iVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f19106a = iVar;
        this.f19107b = context;
    }

    public static void b(a aVar, MainActivity mainActivity) {
        PendingIntent pendingIntent;
        a();
        if (aVar != null) {
            PendingIntent pendingIntent2 = aVar.f19101b;
            if (pendingIntent2 != null) {
                pendingIntent = pendingIntent2;
            } else {
                pendingIntent = null;
            }
            if (pendingIntent != null && !aVar.f19102c) {
                aVar.f19102c = true;
                if (pendingIntent2 == null) {
                    pendingIntent2 = null;
                }
                mainActivity.startIntentSenderForResult(pendingIntent2.getIntentSender(), AdError.NO_FILL_ERROR_CODE, null, 0, 0, 0, null);
            }
        }
    }

    public final o a() {
        String packageName = this.f19107b.getPackageName();
        s sVar = i.e;
        i iVar = this.f19106a;
        m mVar = iVar.f19118a;
        if (mVar == null) {
            Object[] objArr = {-9};
            sVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", s.b(sVar.f3857v, "onError(%d)", objArr));
            }
            return h8.d(new da.k(-9, 2));
        }
        sVar.a("requestUpdateInfo(%s)", packageName);
        ib.h hVar = new ib.h();
        mVar.a().post(new g(mVar, hVar, hVar, new g(iVar, hVar, packageName, hVar)));
        return hVar.f18363a;
    }
}
