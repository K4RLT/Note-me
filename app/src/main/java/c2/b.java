package c2;
import r.e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ay;
import com.google.android.gms.internal.ads.ct;
import com.google.android.gms.internal.ads.ed1;
import com.google.android.gms.internal.ads.lx0;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.t81;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.xx;
import com.google.android.gms.internal.ads.xy;
import com.google.android.gms.internal.ads.yx;
import com.google.android.gms.internal.ads.zb1;
import com.google.android.gms.internal.ads.zx;
import com.google.android.gms.internal.measurement.e4;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3467a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3468b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3469c;

    public b(Context context, z8.b bVar) {
        this.f3467a = 5;
        if (z8.u.f32008a == null) {
            synchronized (z8.u.class) {
                try {
                    if (z8.u.f32008a == null) {
                        g9.n nVar = g9.p.f17688g.f17690b;
                        tr trVar = new tr();
                        nVar.getClass();
                        z8.u.f32008a = (g9.r0) new g9.k(nVar, context, trVar).d(context, false);
                    }
                } finally {
                }
            }
        }
        this.f3468b = z8.u.f32008a;
        context.getApplicationContext();
        this.f3469c = bVar;
    }

    public abstract int[] a(int i);

    public int[] b(int i, int i10) {
        if (i >= 0 && i10 >= 0 && i != i10) {
            int[] iArr = (int[]) this.f3469c;
            iArr[0] = i;
            iArr[1] = i10;
            return iArr;
        }
        return null;
    }

    public abstract Object c(IBinder iBinder);

    public Object d(Context context) {
        Context context2;
        if (this.f3469c == null) {
            fa.y.h(context);
            int i = ca.h.e;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 != null) {
                try {
                    this.f3469c = c((IBinder) context2.getClassLoader().loadClass((String) this.f3468b).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new Exception("Could not load creator class.", e);
                } catch (IllegalAccessException e8) {
                    throw new Exception("Could not access creator.", e8);
                } catch (InstantiationException e10) {
                    throw new Exception("Could not instantiate creator.", e10);
                }
            } else {
                throw new Exception("Could not get remote context.");
            }
        }
        return this.f3469c;
    }

    public String e() {
        String str = (String) this.f3468b;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.l.h("text");
        throw null;
    }

    public abstract int[] f(int i);

    public abstract zb1 g(byte[] bArr, int i);

    public byte[] h(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        int i;
        int i10;
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                ((zb1) this.f3469c).i(bArr, 0).get(bArr4);
                int length = bArr2.length;
                int i11 = length & 15;
                if (i11 == 0) {
                    i = length;
                } else {
                    i = (length + 16) - i11;
                }
                int remaining = byteBuffer.remaining();
                int i12 = remaining % 16;
                if (i12 == 0) {
                    i10 = remaining;
                } else {
                    i10 = (remaining + 16) - i12;
                }
                int i13 = i10 + i;
                ByteBuffer order = ByteBuffer.allocate(i13 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(i);
                order.put(byteBuffer);
                order.position(i13);
                order.putLong(length);
                order.putLong(remaining);
                if (MessageDigest.isEqual(ed1.n(bArr4, order.array()), bArr3)) {
                    byteBuffer.position(position);
                    zb1 zb1Var = (zb1) this.f3468b;
                    zb1Var.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    if (bArr.length == zb1Var.g()) {
                        int remaining2 = byteBuffer.remaining();
                        int i14 = remaining2 / 64;
                        for (int i15 = 0; i15 < i14 + 1; i15++) {
                            ByteBuffer i16 = zb1Var.i(bArr, zb1Var.f13134u + i15);
                            if (i15 == i14) {
                                xy.M(allocate, byteBuffer, i16, remaining2 % 64);
                            } else {
                                xy.M(allocate, byteBuffer, i16, 64);
                            }
                        }
                        return allocate.array();
                    }
                    int g8 = zb1Var.g();
                    throw new GeneralSecurityException(a5.a.f(g8, "The nonce length (in bytes) must be ", new StringBuilder(String.valueOf(g8).length() + 36)));
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        androidx.datastore.preferences.protobuf.s1.q("ciphertext too short");
        return null;
    }

    public void i(ay ayVar, zx zxVar) {
        e4 e4Var = new e4(this, ayVar, zxVar);
        yx yxVar = (yx) this.f3468b;
        yxVar.a(new t81(yxVar, 0, e4Var), xx.f12657h);
    }

    public void j() {
        switch (this.f3467a) {
            case 1:
                ((yx) this.f3468b).c(new Exception());
                return;
            default:
                try {
                    ((g9.r0) this.f3468b).O(((z8.b) this.f3469c).f31978u);
                    return;
                } catch (RemoteException e) {
                    l9.i.i(e, "#007 Could not call remote method.");
                    return;
                }
        }
    }

    public void k(String str, Throwable th) {
        ((yx) this.f3468b).c(th);
        if (((Boolean) g9.e.f17698c.a(sl.C8)).booleanValue()) {
            f9.k.C.f16817h.e(str, th);
        }
    }

    public b(String str) {
        this.f3467a = 4;
        this.f3468b = str;
    }

    public b(e4 e4Var, k9.c0 c0Var) {
        this.f3467a = 2;
        this.f3469c = e4Var;
        this.f3468b = c0Var;
    }

    public b(byte[] bArr) {
        this.f3467a = 3;
        if (ct.i(1)) {
            this.f3468b = g(bArr, 1);
            this.f3469c = g(bArr, 0);
        } else {
            androidx.datastore.preferences.protobuf.s1.q("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
    }

    public b(int i) {
        this.f3467a = i;
        switch (i) {
            case 1:
                yx yxVar = new yx();
                this.f3468b = yxVar;
                this.f3469c = new AtomicInteger(0);
                lx0 lx0Var = new lx0(13, this);
                yxVar.a(new t81(yxVar, 0, lx0Var), xx.f12657h);
                return;
            default:
                this.f3469c = new int[2];
                return;
        }
    }
}
