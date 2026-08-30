package vd;
import b0.b;
import b0.x;
import t.g0;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f27615a;

    /* renamed from: b, reason: collision with root package name */
    public long f27616b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f27617c;

    public k0(Looper looper) {
        super(looper);
        this.f27617c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        String str;
        if (this.f27615a) {
            Object b10 = bc.g.c().b(h0.class);
            b10.getClass();
            c(messenger, ((h0) b10).b().f27542a);
            return;
        }
        Object b11 = bc.g.c().b(u.class);
        b11.getClass();
        m mVar = (m) ((z) ((u) b11)).f27652c.get();
        if (mVar != null) {
            str = mVar.f27620a;
        } else {
            str = null;
        }
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        String a10;
        Object b10 = bc.g.c().b(h0.class);
        b10.getClass();
        h0 h0Var = (h0) b10;
        int i = h0Var.f27597d + 1;
        h0Var.f27597d = i;
        if (i == 0) {
            a10 = h0Var.f27596c;
        } else {
            a10 = h0Var.a();
        }
        String str = a10;
        String str2 = h0Var.f27596c;
        int i10 = h0Var.f27597d;
        h0Var.f27594a.getClass();
        h0Var.e = new a0(i10, System.currentTimeMillis() * 1000, str, str2);
        h0Var.b();
        StringBuilder sb2 = new StringBuilder("Generated new session ");
        Object b11 = bc.g.c().b(h0.class);
        b11.getClass();
        sb2.append(((h0) b11).b().f27542a);
        Log.d("SessionLifecycleService", sb2.toString());
        StringBuilder sb3 = new StringBuilder("Broadcasting new session: ");
        Object b12 = bc.g.c().b(h0.class);
        b12.getClass();
        sb3.append(((h0) b12).b());
        Log.d("SessionLifecycleService", sb3.toString());
        Object b13 = bc.g.c().b(d0.class);
        b13.getClass();
        Object b14 = bc.g.c().b(h0.class);
        b14.getClass();
        f0 f0Var = (f0) ((d0) b13);
        te.c cVar = null;
        pf.x(pf.b(f0Var.e), null, new g0(f0Var, ((h0) b14).b(), null), 3);
        ArrayList arrayList = new ArrayList(this.f27617c);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Messenger messenger = (Messenger) obj;
            messenger.getClass();
            a(messenger);
        }
        Object b15 = bc.g.c().b(u.class);
        b15.getClass();
        Object b16 = bc.g.c().b(h0.class);
        b16.getClass();
        String str3 = ((h0) b16).b().f27542a;
        z zVar = (z) ((u) b15);
        str3.getClass();
        pf.x(pf.b(zVar.f27651b), null, new l5.a(zVar, str3, cVar, 18), 3);
    }

    public final void c(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.f27617c.remove(messenger);
        } catch (Exception e) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x011e, code lost:
    
        if (nf.b.e(r10) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014d, code lost:
    
        if (nf.b.e(r10) == false) goto L44;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.k0.handleMessage(android.os.Message):void");
    }
}
