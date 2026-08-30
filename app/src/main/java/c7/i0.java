package c7;
import c0.b;
import c0.z;
import t.h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import com.google.android.gms.internal.play_billing.b3;
import com.google.android.gms.internal.play_billing.d1;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.k1;
import com.google.android.gms.internal.play_billing.o1;
import eb.h3;

/* loaded from: classes.dex */
public final class i0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3968a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3969b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3970c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3971d;

    public i0(z zVar, boolean z3) {
        this.f3971d = zVar;
        this.f3970c = z3;
    }

    public synchronized void a(Context context, IntentFilter intentFilter) {
        int i;
        try {
            if (this.f3969b) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.f3970c) {
                    i = 4;
                } else {
                    i = 2;
                }
                context.registerReceiver(this, intentFilter, i);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f3969b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b() {
        h3 h3Var = (h3) this.f3971d;
        h3Var.a0();
        h3Var.h().u();
        h3Var.h().u();
        if (!this.f3969b) {
            return;
        }
        h3Var.f().I.g("Unregistering connectivity change receiver");
        this.f3969b = false;
        this.f3970c = false;
        try {
            h3Var.F.f16102u.unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            h3Var.f().A.f(e, "Failed to unregister the network broadcast receiver");
        }
    }

    public void c(Bundle bundle, f fVar, int i, i3 i3Var, long j10, boolean z3) {
        k1 b10;
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            z zVar = (z) this.f3971d;
            if (byteArray != null) {
                d0 d0Var = (d0) zVar.f3439x;
                byte[] byteArray2 = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i10 = k1.f15476a;
                synchronized (k1.class) {
                    int i11 = k1.f15476a;
                    int i12 = d1.f15402a;
                    b10 = o1.b();
                    int i13 = k1.f15476a;
                }
                ((pw) d0Var).v(b3.t(byteArray2, b10), j10, z3);
                return;
            }
            ((pw) ((d0) zVar.f3439x)).v(b(23, i, fVar, null, i3Var), j10, z3);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0283  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.i0.onReceive(android.content.Context, android.content.Intent):void");
    }

    public i0(h3 h3Var) {
        this.f3971d = h3Var;
    }
}
