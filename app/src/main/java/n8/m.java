package n8;
import l.a;

import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import b8.u4;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.x0;
import eb.z1;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import q2.s;
import q2.u;
import q2.y;
import ya.v9;

/* loaded from: classes.dex */
public final class m implements p8.b, o9.d, pa.c, y, qb.j, r6.b, k8.e, vc.b, w8.a, y3.b {
    public static Typeface m(String str, s sVar, int i) {
        if (i == 0 && kotlin.jvm.internal.a(sVar, s.f23367y) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int a10 = v9.a(i, sVar);
        if (str != null && str.length() != 0) {
            return Typeface.create(str, a10);
        }
        return Typeface.defaultFromStyle(a10);
    }

    public static vc.a n(m mVar) {
        boolean z3 = false;
        return new vc.a(System.currentTimeMillis() + 3600000, new u4(8, 12), new f6(true, z3, z3), 10.0d, 1.2d, 60);
    }

    @Override // r6.b
    public boolean a(float f10) {
        throw new IllegalStateException("not implemented");
    }

    @Override // k8.e
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // r6.b
    public b7.a b() {
        throw new IllegalStateException("not implemented");
    }

    @Override // r6.b
    public boolean c(float f10) {
        return false;
    }

    @Override // qb.j
    public Object d(IBinder iBinder) {
        int i = pb.f.f22642v;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHsdpService");
        if (queryLocalInterface instanceof pb.g) {
            return (pb.g) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.play.core.hsdp.protocol.IHsdpService", 7);
    }

    @Override // w8.a
    public long e() {
        return System.currentTimeMillis();
    }

    @Override // q2.y
    public Typeface f(u uVar, s sVar, int i) {
        String str = uVar.f23371z;
        int i10 = sVar.f23369u / 100;
        if (i10 >= 0 && i10 < 2) {
            str = str.concat("-thin");
        } else if (2 <= i10 && i10 < 4) {
            str = str.concat("-light");
        } else if (i10 != 4) {
            if (i10 == 5) {
                str = str.concat("-medium");
            } else if ((6 > i10 || i10 >= 8) && 8 <= i10 && i10 < 11) {
                str = str.concat("-black");
            }
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface m4 = m(str, sVar, i);
            if (!kotlin.jvm.internal.a(m4, Typeface.create(Typeface.DEFAULT, v9.a(i, sVar))) && !kotlin.jvm.internal.a(m4, m(null, sVar, i))) {
                typeface = m4;
            }
        }
        if (typeface == null) {
            return m(uVar.f23371z, sVar, i);
        }
        return typeface;
    }

    @Override // q2.y
    public Typeface g(int i, s sVar) {
        return m(null, sVar, i);
    }

    @Override // oe.a
    public Object get() {
        return new z1(3, Executors.newSingleThreadExecutor());
    }

    @Override // vc.b
    public vc.a i(m mVar, JSONObject jSONObject) {
        return n(mVar);
    }

    @Override // r6.b
    public boolean isEmpty() {
        return true;
    }

    @Override // r6.b
    public float j() {
        return 1.0f;
    }

    @Override // r6.b
    public float k() {
        return 0.0f;
    }

    @Override // pa.c
    public x0 l(Context context, String str, pa.b bVar) {
        x0 x0Var = new x0();
        x0Var.f12384a = bVar.c(context, str);
        int i = 1;
        int b10 = bVar.b(context, str, true);
        x0Var.f12385b = b10;
        int i10 = x0Var.f12384a;
        if (i10 == 0) {
            i10 = 0;
            if (b10 == 0) {
                i = 0;
                x0Var.f12386c = i;
                return x0Var;
            }
        }
        if (i10 >= b10) {
            i = -1;
        }
        x0Var.f12386c = i;
        return x0Var;
    }

    @Override // y3.b
    public Object h(y3.a aVar) {
        throw aVar;
    }
}
