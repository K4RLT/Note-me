package mc;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.is0;
import com.google.android.gms.internal.ads.iw0;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.x0;
import ea.h;
import ib.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.l;
import n8.o;
import n8.q;
import pb.d;
import q2.s;
import q2.u;
import q2.y;
import qb.j;
import ra.f;
import va.n;
import wa.e7;
import wa.h8;

/* loaded from: classes.dex */
public final class c implements a, o9.c, g, pa.c, pc.c, y, j, q5.a, h, w8.a, wc.a {
    public c(Context context, n nVar, int i) {
        switch (i) {
            case 12:
                l8.a aVar = l8.a.e;
                q.b(context);
                o c10 = q.a().c(aVar);
                if (l8.a.f20019d.contains(new k8.c("json"))) {
                    new ic.n(new va.q(c10, 0));
                }
                new ic.n(new va.q(c10, 1));
                return;
            default:
                new ArrayList().add(new c(context, nVar, 12));
                return;
        }
    }

    public static final float j(float f10, float[] fArr, float[] fArr2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float abs = Math.abs(f10);
        float signum = Math.signum(f10);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i10 = i - 1;
        if (i10 >= fArr.length - 1) {
            float f16 = fArr[fArr.length - 1];
            float f17 = fArr2[fArr.length - 1];
            if (f16 == 0.0f) {
                return 0.0f;
            }
            return (f17 / f16) * f10;
        }
        if (i10 == -1) {
            float f18 = fArr[0];
            f13 = fArr2[0];
            f14 = f18;
            f12 = 0.0f;
            f11 = 0.0f;
        } else {
            float f19 = fArr[i10];
            float f20 = fArr[i];
            f11 = fArr2[i10];
            f12 = f19;
            f13 = fArr2[i];
            f14 = f20;
        }
        if (f12 == f14) {
            f15 = 0.0f;
        } else {
            f15 = (abs - f12) / (f14 - f12);
        }
        return (((f13 - f11) * Math.max(0.0f, Math.min(1.0f, f15))) + f11) * signum;
    }

    public static Typeface m(String str, s sVar, int i) {
        Typeface create;
        Typeface create2;
        if (i == 0 && l.a(sVar, s.f23367y) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        boolean z3 = false;
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        int i10 = sVar.f23369u;
        if (i == 1) {
            z3 = true;
        }
        create2 = Typeface.create(create, i10, z3);
        return create2;
    }

    @Override // ea.h
    public void accept(Object obj, Object obj2) {
        ra.c cVar = (ra.c) ((ra.b) obj).t();
        f fVar = new f((ib.h) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = ra.a.f24671a;
        obtain.writeInt(1);
        e7.l(obtain, e7.k(obtain, 20293));
        obtain.writeStrongBinder(fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f24672u.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // pc.c
    public String b() {
        return null;
    }

    @Override // q5.a
    public q5.b c(is0 is0Var) {
        return new r5.h((Context) is0Var.f7206w, (String) is0Var.f7207x, (iw0) is0Var.f7208y, is0Var.f7204u, is0Var.f7205v);
    }

    @Override // qb.j
    public Object d(IBinder iBinder) {
        int i = pb.c.f22641v;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHpoaService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.play.core.hsdp.protocol.IHpoaService", 7);
    }

    @Override // w8.a
    public long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override // q2.y
    public Typeface f(u uVar, s sVar, int i) {
        return m(uVar.f23371z, sVar, i);
    }

    @Override // q2.y
    public Typeface g(int i, s sVar) {
        return m(null, sVar, i);
    }

    @Override // wc.a
    public StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i13 = i10 - intValue;
                if (i10 + i13 <= stackTraceElementArr.length) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (stackTraceElementArr[intValue + i14].equals(stackTraceElementArr[i10 + i14])) {
                        }
                    }
                    int intValue2 = i10 - num.intValue();
                    if (i12 < 10) {
                        System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, i11, intValue2);
                        i11 += intValue2;
                        i12++;
                    }
                    i = (intValue2 - 1) + i10;
                    hashMap.put(stackTraceElement, Integer.valueOf(i10));
                    i10 = i + 1;
                }
            }
            stackTraceElementArr2[i11] = stackTraceElementArr[i10];
            i11++;
            i12 = 1;
            i = i10;
            hashMap.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        if (i11 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override // mc.a
    public void k(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // pa.c
    public x0 l(Context context, String str, pa.b bVar) {
        x0 x0Var = new x0();
        int b10 = bVar.b(context, str, true);
        x0Var.f12385b = b10;
        if (b10 != 0) {
            x0Var.f12386c = 1;
            return x0Var;
        }
        int c10 = bVar.c(context, str);
        x0Var.f12384a = c10;
        if (c10 != 0) {
            x0Var.f12386c = -1;
        }
        return x0Var;
    }

    @Override // ib.g
    public ib.o q(Object obj) {
        return h8.e(Boolean.TRUE);
    }

    @Override // pc.c
    public void a() {
    }

    @Override // pc.c
    public void i(long j10, String str) {
    }
}
