package t;
import l.c;
import g2.a;
import i1.d;
import q.e;
import q.h;
import q.r0;
import r0.i1;
import r0.n2;
import r0.y;
import u.b;
import u.g;
import u.l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import wa.h8;

/* loaded from: classes.dex */
public final class a implements b, p8.b, xa.c1, y5.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25314u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25315v;

    public a(ub.f fVar) {
        this.f25314u = 4;
        new Handler(Looper.getMainLooper());
        this.f25315v = fVar;
    }

    @Override // b
    public Object a(f1 f1Var, Float f10, Float f11, df.l lVar, g gVar) {
        float floatValue = f10.floatValue();
        float floatValue2 = f11.floatValue();
        Object c10 = l.c(f1Var, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, e.b(28, 0.0f, floatValue2), (r0) this.f25315v, lVar, gVar);
        if (c10 == ue.a.f27192u) {
            return c10;
        }
        return (u.a) c10;
    }

    public void b(byte b10) {
        ((Parcel) this.f25315v).writeByte(b10);
    }

    public void c(float f10) {
        ((Parcel) this.f25315v).writeFloat(f10);
    }

    public void d(long j10) {
        long b10 = y2.o.b(j10);
        byte b11 = 0;
        if (!y2.p.a(b10, 0L)) {
            if (y2.p.a(b10, 4294967296L)) {
                b11 = 1;
            } else if (y2.p.a(b10, 8589934592L)) {
                b11 = 2;
            }
        }
        b(b11);
        if (!y2.p.a(y2.o.b(j10), 0L)) {
            c(y2.o.c(j10));
        }
    }

    public n2 e() {
        c4.k a10 = c4.k.a();
        if (a10.c() == 1) {
            return new u2.k(true);
        }
        i1 B = y.B(Boolean.FALSE);
        a10.h(new u2.g(B, this));
        return B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [vc.b] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public vc.a f(JSONObject jSONObject) {
        Object r02;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            r02 = new Object();
        } else {
            r02 = new Object();
        }
        return r02.i((n8.m) this.f25315v, jSONObject);
    }

    public ib.o g() {
        String d2;
        ub.f fVar = (ub.f) this.f25315v;
        String str = fVar.f27157b;
        c7.a aVar = ub.f.f27155c;
        aVar.n("requestInAppReview (%s)", str);
        vb.h hVar = fVar.f27156a;
        if (hVar == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", c7.a.p(aVar.f3896v, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            HashMap hashMap = wb.a.f29878a;
            if (!hashMap.containsKey(-1)) {
                d2 = "";
            } else {
                d2 = w7.d((String) hashMap.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) wb.a.f29879b.get(-1), ")");
            }
            return h8.d(new da.d(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, d2), null, null)));
        }
        ib.h hVar2 = new ib.h();
        hVar.a().post(new vb.f(hVar, hVar2, hVar2, new ub.d(fVar, hVar2, hVar2)));
        return hVar2.f18363a;
    }

    @Override // oe.a
    public Object get() {
        String packageName = ((Context) ((oe.a) this.f25315v).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        g5.h("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [xa.k, java.lang.Object] */
    public void h(String str, Object... objArr) {
        List asList = Arrays.asList(objArr);
        Iterator it = asList.iterator();
        if (it.hasNext()) {
            xa.d dVar = (xa.d) this.f25315v;
            if (dVar == null) {
                dVar = new xa.d();
                this.f25315v = dVar;
            }
            xa.k kVar = (xa.k) dVar.get(str);
            xa.k kVar2 = kVar;
            if (kVar == null) {
                int i = 4;
                if (asList instanceof Set) {
                    i = Math.max(4, ((Set) asList).size());
                }
                xa.u0.i(i, "expectedSize");
                Object obj = new Object();
                xa.u0.i(i, "initialCapacity");
                obj.f30441a = new Object[i];
                obj.f30442b = 0;
                obj.f30444d = new Object[xa.l.n(i)];
                xa.d dVar2 = (xa.d) this.f25315v;
                Map map = dVar2;
                if (dVar2 == null) {
                    xa.d dVar3 = new xa.d();
                    this.f25315v = dVar3;
                    map = dVar3;
                }
                map.put(str, obj);
                kVar2 = obj;
            }
            while (it.hasNext()) {
                Object next = it.next();
                xa.u0.r(str, next);
                if (kVar2.f30444d != null) {
                    int n10 = xa.l.n(kVar2.f30442b);
                    Object[] objArr2 = kVar2.f30444d;
                    if (n10 <= objArr2.length) {
                        int length = objArr2.length - 1;
                        int hashCode = next.hashCode();
                        int a10 = xa.u0.a(hashCode);
                        while (true) {
                            int i10 = a10 & length;
                            Object[] objArr3 = kVar2.f30444d;
                            Object obj2 = objArr3[i10];
                            if (obj2 == null) {
                                objArr3[i10] = next;
                                kVar2.e += hashCode;
                                kVar2.a(next);
                                break;
                            } else if (!obj2.equals(next)) {
                                a10 = i10 + 1;
                            }
                        }
                    }
                }
                kVar2.f30444d = null;
                kVar2.a(next);
            }
        }
    }

    @Override // xa.c1
    public Object zza() {
        switch (this.f25314u) {
            case 8:
                Type type = (Type) this.f25315v;
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return new EnumMap((Class) type2);
                    }
                    throw new ab.b("Invalid EnumMap type: ".concat(String.valueOf(type.toString())), 21);
                }
                throw new ab.b("Invalid EnumMap type: ".concat(String.valueOf(type.toString())), 21);
            default:
                Constructor constructor = (Constructor) this.f25315v;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    xa.u0 u0Var = xa.g2.f30419a;
                    l4.a.k("Unexpected IllegalAccessException occurred (Gson 2.12.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e8) {
                    l4.a.k(p.a.k("Failed to invoke constructor '", xa.g2.a(constructor), "' with no args"), e8);
                    return null;
                } catch (InvocationTargetException e10) {
                    l4.a.k(p.a.k("Failed to invoke constructor '", xa.g2.a(constructor), "' with no args"), e10.getCause());
                    return null;
                }
        }
    }

    public /* synthetic */ a(int i, Object obj) {
        this.f25314u = i;
        this.f25315v = obj;
    }

    public /* synthetic */ a(int i) {
        this.f25314u = i;
    }
}