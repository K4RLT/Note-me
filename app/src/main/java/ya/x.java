package ya;
import cd.b;
import cd.h;
import g3.a;
import w7.i1;
import zc.c;
import zc.d;
import zc.e;
import zc.f;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class x implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f31571f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final c f31572g = new c("key", a.p(i1.f(v.class, new r(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final c f31573h = new c("value", a.p(i1.f(v.class, new r(2))));
    public static final w i = w.f31543b;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f31574a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f31575b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f31576c;

    /* renamed from: d, reason: collision with root package name */
    public final d f31577d;
    public final h e = new h(this, 2);

    public x(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, d dVar) {
        this.f31574a = byteArrayOutputStream;
        this.f31575b = hashMap;
        this.f31576c = hashMap2;
        this.f31577d = dVar;
    }

    public static int j(c cVar) {
        v vVar = (v) cVar.a(v.class);
        if (vVar != null) {
            return vVar.zza();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // e
    public final e a(c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    public final void b(c cVar, double d2, boolean z3) {
        if (z3 && d2 == 0.0d) {
            return;
        }
        l((j(cVar) << 3) | 1);
        this.f31574a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d2).array());
    }

    public final void c(c cVar, Object obj, boolean z3) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z3 || charSequence.length() != 0) {
                    l((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f31571f);
                    l(bytes.length);
                    this.f31574a.write(bytes);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    c(cVar, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    k(i, cVar, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                b(cVar, ((Double) obj).doubleValue(), z3);
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z3 || floatValue != 0.0f) {
                    l((j(cVar) << 3) | 5);
                    this.f31574a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Number) {
                i(cVar, ((Number) obj).longValue(), z3);
                return;
            }
            if (obj instanceof Boolean) {
                h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z3);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z3 && bArr.length == 0) {
                    return;
                }
                l((j(cVar) << 3) | 2);
                l(bArr.length);
                this.f31574a.write(bArr);
                return;
            }
            d dVar = (d) this.f31575b.get(obj.getClass());
            if (dVar != null) {
                k(dVar, cVar, obj, z3);
                return;
            }
            f fVar = (f) this.f31576c.get(obj.getClass());
            if (fVar != null) {
                h hVar = this.e;
                hVar.f4096b = false;
                hVar.f4098d = cVar;
                hVar.f4097c = z3;
                fVar.a(obj, hVar);
                return;
            }
            if (obj instanceof t) {
                h(cVar, ((t) obj).zza(), true);
            } else if (obj instanceof Enum) {
                h(cVar, ((Enum) obj).ordinal(), true);
            } else {
                k(this.f31577d, cVar, obj, z3);
            }
        }
    }

    @Override // e
    public final /* synthetic */ e d(c cVar, long j10) {
        i(cVar, j10, true);
        return this;
    }

    @Override // e
    public final e e(c cVar, double d2) {
        b(cVar, d2, true);
        return this;
    }

    @Override // e
    public final /* synthetic */ e f(c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override // e
    public final /* synthetic */ e g(c cVar, boolean z3) {
        h(cVar, z3 ? 1 : 0, true);
        return this;
    }

    public final void h(c cVar, int i10, boolean z3) {
        if (!z3 || i10 != 0) {
            v vVar = (v) cVar.a(v.class);
            if (vVar != null) {
                int ordinal = vVar.zzb().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        l((vVar.zza() << 3) | 5);
                        this.f31574a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
                        return;
                    }
                    l(vVar.zza() << 3);
                    l((i10 + i10) ^ (i10 >> 31));
                    return;
                }
                l(vVar.zza() << 3);
                l(i10);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void i(c cVar, long j10, boolean z3) {
        if (!z3 || j10 != 0) {
            v vVar = (v) cVar.a(v.class);
            if (vVar != null) {
                int ordinal = vVar.zzb().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        l((vVar.zza() << 3) | 1);
                        this.f31574a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
                        return;
                    }
                    l(vVar.zza() << 3);
                    m((j10 >> 63) ^ (j10 + j10));
                    return;
                }
                l(vVar.zza() << 3);
                m(j10);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void k(d dVar, c cVar, Object obj, boolean z3) {
        b bVar = new b(2);
        bVar.f4084v = 0L;
        try {
            OutputStream outputStream = this.f31574a;
            this.f31574a = bVar;
            try {
                dVar.a(obj, this);
                this.f31574a = outputStream;
                long j10 = bVar.f4084v;
                bVar.close();
                if (z3 && j10 == 0) {
                    return;
                }
                l((j(cVar) << 3) | 2);
                m(j10);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f31574a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void l(int i10) {
        while (true) {
            long j10 = i10 & (-128);
            int i11 = i10 & 127;
            OutputStream outputStream = this.f31574a;
            if (j10 != 0) {
                outputStream.write(i11 | 128);
                i10 >>>= 7;
            } else {
                outputStream.write(i11);
                return;
            }
        }
    }

    public final void m(long j10) {
        while (true) {
            long j11 = (-128) & j10;
            int i10 = ((int) j10) & 127;
            OutputStream outputStream = this.f31574a;
            if (j11 != 0) {
                outputStream.write(i10 | 128);
                j10 >>>= 7;
            } else {
                outputStream.write(i10);
                return;
            }
        }
    }
}
