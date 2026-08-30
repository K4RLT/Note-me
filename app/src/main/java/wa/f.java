package wa;
import i1.e;
import g3.a;
import w7.i1;

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
public final class f implements zc.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f29606f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f29607g = new zc.c("key", a.p(i1.e(d.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final zc.c f29608h = new zc.c("value", a.p(i1.e(d.class, new a(2))));
    public static final e i = e.f29598b;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f29609a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f29610b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f29611c;

    /* renamed from: d, reason: collision with root package name */
    public final zc.d f29612d;
    public final cd.h e = new cd.h(this, 1);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, zc.d dVar) {
        this.f29609a = byteArrayOutputStream;
        this.f29610b = hashMap;
        this.f29611c = hashMap2;
        this.f29612d = dVar;
    }

    public static int j(zc.c cVar) {
        d dVar = (d) cVar.a(d.class);
        if (dVar != null) {
            return dVar.zza();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // zc.e
    public final zc.e a(zc.c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    public final void b(zc.c cVar, double d2, boolean z3) {
        if (z3 && d2 == 0.0d) {
            return;
        }
        l((j(cVar) << 3) | 1);
        this.f29609a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d2).array());
    }

    public final void c(zc.c cVar, Object obj, boolean z3) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z3 || charSequence.length() != 0) {
                    l((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f29606f);
                    l(bytes.length);
                    this.f29609a.write(bytes);
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
                    this.f29609a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
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
                this.f29609a.write(bArr);
                return;
            }
            zc.d dVar = (zc.d) this.f29610b.get(obj.getClass());
            if (dVar != null) {
                k(dVar, cVar, obj, z3);
                return;
            }
            zc.f fVar = (zc.f) this.f29611c.get(obj.getClass());
            if (fVar != null) {
                cd.h hVar = this.e;
                hVar.f4096b = false;
                hVar.f4098d = cVar;
                hVar.f4097c = z3;
                fVar.a(obj, hVar);
                return;
            }
            if (obj instanceof b) {
                h(cVar, ((b) obj).zza(), true);
            } else if (obj instanceof Enum) {
                h(cVar, ((Enum) obj).ordinal(), true);
            } else {
                k(this.f29612d, cVar, obj, z3);
            }
        }
    }

    @Override // zc.e
    public final /* synthetic */ zc.e d(zc.c cVar, long j10) {
        i(cVar, j10, true);
        return this;
    }

    @Override // zc.e
    public final zc.e e(zc.c cVar, double d2) {
        b(cVar, d2, true);
        return this;
    }

    @Override // zc.e
    public final /* synthetic */ zc.e f(zc.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override // zc.e
    public final /* synthetic */ zc.e g(zc.c cVar, boolean z3) {
        h(cVar, z3 ? 1 : 0, true);
        return this;
    }

    public final void h(zc.c cVar, int i10, boolean z3) {
        if (!z3 || i10 != 0) {
            d dVar = (d) cVar.a(d.class);
            if (dVar != null) {
                int ordinal = dVar.zzb().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        l((dVar.zza() << 3) | 5);
                        this.f29609a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
                        return;
                    }
                    l(dVar.zza() << 3);
                    l((i10 + i10) ^ (i10 >> 31));
                    return;
                }
                l(dVar.zza() << 3);
                l(i10);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void i(zc.c cVar, long j10, boolean z3) {
        if (!z3 || j10 != 0) {
            d dVar = (d) cVar.a(d.class);
            if (dVar != null) {
                int ordinal = dVar.zzb().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        l((dVar.zza() << 3) | 1);
                        this.f29609a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
                        return;
                    }
                    l(dVar.zza() << 3);
                    m((j10 >> 63) ^ (j10 + j10));
                    return;
                }
                l(dVar.zza() << 3);
                m(j10);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void k(zc.d dVar, zc.c cVar, Object obj, boolean z3) {
        cd.b bVar = new cd.b(1);
        bVar.f4084v = 0L;
        try {
            OutputStream outputStream = this.f29609a;
            this.f29609a = bVar;
            try {
                dVar.a(obj, this);
                this.f29609a = outputStream;
                long j10 = bVar.f4084v;
                bVar.close();
                if (z3 && j10 == 0) {
                    return;
                }
                l((j(cVar) << 3) | 2);
                m(j10);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f29609a = outputStream;
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
            OutputStream outputStream = this.f29609a;
            if (j10 != 0) {
                outputStream.write((i10 & 127) | 128);
                i10 >>>= 7;
            } else {
                outputStream.write(i10 & 127);
                return;
            }
        }
    }

    public final void m(long j10) {
        while (true) {
            long j11 = (-128) & j10;
            OutputStream outputStream = this.f29609a;
            if (j11 != 0) {
                outputStream.write((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } else {
                outputStream.write(((int) j10) & 127);
                return;
            }
        }
    }
}
