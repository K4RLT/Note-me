package cd;

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
    public static final Charset f4087f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f4088g = new zc.c("key", g3.a.p(g3.a.o(e.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final zc.c f4089h = new zc.c("value", g3.a.p(g3.a.o(e.class, new a(2))));
    public static final bd.a i = new bd.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f4090a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4091b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4092c;

    /* renamed from: d, reason: collision with root package name */
    public final zc.d f4093d;
    public final h e = new h(this, 0);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, zc.d dVar) {
        this.f4090a = byteArrayOutputStream;
        this.f4091b = hashMap;
        this.f4092c = hashMap2;
        this.f4093d = dVar;
    }

    public static int k(zc.c cVar) {
        e eVar = (e) cVar.a(e.class);
        if (eVar != null) {
            return eVar.tag();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // zc.e
    public final zc.e a(zc.c cVar, Object obj) {
        i(cVar, obj, true);
        return this;
    }

    public final void b(zc.c cVar, double d2, boolean z3) {
        if (z3 && d2 == 0.0d) {
            return;
        }
        l((k(cVar) << 3) | 1);
        this.f4090a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d2).array());
    }

    public final void c(zc.c cVar, int i10, boolean z3) {
        if (!z3 || i10 != 0) {
            e eVar = (e) cVar.a(e.class);
            if (eVar != null) {
                int ordinal = eVar.intEncoding().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        l((eVar.tag() << 3) | 5);
                        this.f4090a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
                        return;
                    }
                    l(eVar.tag() << 3);
                    l((i10 << 1) ^ (i10 >> 31));
                    return;
                }
                l(eVar.tag() << 3);
                l(i10);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    @Override // zc.e
    public final zc.e d(zc.c cVar, long j10) {
        h(cVar, j10, true);
        return this;
    }

    @Override // zc.e
    public final zc.e e(zc.c cVar, double d2) {
        b(cVar, d2, true);
        return this;
    }

    @Override // zc.e
    public final zc.e f(zc.c cVar, int i10) {
        c(cVar, i10, true);
        return this;
    }

    @Override // zc.e
    public final zc.e g(zc.c cVar, boolean z3) {
        c(cVar, z3 ? 1 : 0, true);
        return this;
    }

    public final void h(zc.c cVar, long j10, boolean z3) {
        if (!z3 || j10 != 0) {
            e eVar = (e) cVar.a(e.class);
            if (eVar != null) {
                int ordinal = eVar.intEncoding().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        l((eVar.tag() << 3) | 1);
                        this.f4090a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
                        return;
                    }
                    l(eVar.tag() << 3);
                    m((j10 >> 63) ^ (j10 << 1));
                    return;
                }
                l(eVar.tag() << 3);
                m(j10);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void i(zc.c cVar, Object obj, boolean z3) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z3 || charSequence.length() != 0) {
                    l((k(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f4087f);
                    l(bytes.length);
                    this.f4090a.write(bytes);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    i(cVar, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    j(i, cVar, (Map.Entry) it2.next(), false);
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
                    l((k(cVar) << 3) | 5);
                    this.f4090a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Number) {
                h(cVar, ((Number) obj).longValue(), z3);
                return;
            }
            if (obj instanceof Boolean) {
                c(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z3);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z3 && bArr.length == 0) {
                    return;
                }
                l((k(cVar) << 3) | 2);
                l(bArr.length);
                this.f4090a.write(bArr);
                return;
            }
            zc.d dVar = (zc.d) this.f4091b.get(obj.getClass());
            if (dVar != null) {
                j(dVar, cVar, obj, z3);
                return;
            }
            zc.f fVar = (zc.f) this.f4092c.get(obj.getClass());
            if (fVar != null) {
                h hVar = this.e;
                hVar.f4096b = false;
                hVar.f4098d = cVar;
                hVar.f4097c = z3;
                fVar.a(obj, hVar);
                return;
            }
            if (obj instanceof c) {
                c(cVar, ((c) obj).a(), true);
            } else if (obj instanceof Enum) {
                c(cVar, ((Enum) obj).ordinal(), true);
            } else {
                j(this.f4093d, cVar, obj, z3);
            }
        }
    }

    public final void j(zc.d dVar, zc.c cVar, Object obj, boolean z3) {
        b bVar = new b(0);
        bVar.f4084v = 0L;
        try {
            OutputStream outputStream = this.f4090a;
            this.f4090a = bVar;
            try {
                dVar.a(obj, this);
                this.f4090a = outputStream;
                long j10 = bVar.f4084v;
                bVar.close();
                if (z3 && j10 == 0) {
                    return;
                }
                l((k(cVar) << 3) | 2);
                m(j10);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f4090a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i10) {
        while (true) {
            long j10 = i10 & (-128);
            OutputStream outputStream = this.f4090a;
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
            OutputStream outputStream = this.f4090a;
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
