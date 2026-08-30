package xa;
import x.n;
import q.x;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class z1 implements j0 {

    /* renamed from: x, reason: collision with root package name */
    public static final j1 f30728x = new j1(3);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30729u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f30730v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f30731w;

    public z1(n0 n0Var) {
        this.f30729u = 2;
        this.f30730v = n0Var;
        this.f30731w = new ConcurrentHashMap();
    }

    @Override // xa.j0
    public final i0 a(z zVar, k2 k2Var) {
        switch (this.f30729u) {
            case 0:
                if (k2Var.f30449a == ((Class) this.f30730v)) {
                    return (i0) this.f30731w;
                }
                return null;
            case 1:
                Class cls = (Class) this.f30730v;
                Class<?> cls2 = k2Var.f30449a;
                if (!cls.isAssignableFrom(cls2)) {
                    return null;
                }
                return new k1(this, (i0) this.f30731w, cls2);
            default:
                k0 k0Var = (k0) k2Var.f30449a.getAnnotation(k0.class);
                if (k0Var == null) {
                    return null;
                }
                return b((n0) this.f30730v, zVar, k2Var, k0Var, true);
        }
    }

    public i0 b(n0 n0Var, z zVar, k2 k2Var, k0 k0Var, boolean z3) {
        i0 a10;
        Object zza = n0Var.a(new k2(k0Var.zza()), true).zza();
        boolean z9 = zza instanceof i0;
        boolean zzb = k0Var.zzb();
        if (z9) {
            a10 = (i0) zza;
        } else if (zza instanceof j0) {
            j0 j0Var = (j0) zza;
            if (z3) {
                j0 j0Var2 = (j0) ((ConcurrentHashMap) this.f30731w).putIfAbsent(k2Var.f30449a, j0Var);
                if (j0Var2 != null) {
                    j0Var = j0Var2;
                }
            }
            a10 = j0Var.a(zVar, k2Var);
        } else {
            x.n(a5.a.h("Invalid attempt to bind an instance of ", zza.getClass().getName(), " as a @JsonAdapter for ", u0.o(k2Var.f30450b), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."));
            return null;
        }
        if (a10 != null && zzb) {
            return a10.b();
        }
        return a10;
    }

    public String toString() {
        switch (this.f30729u) {
            case 0:
                return a5.a.h("Factory[type=", ((Class) this.f30730v).getName(), ",adapter=", String.valueOf((i0) this.f30731w), "]");
            case 1:
                return a5.a.h("Factory[typeHierarchy=", ((Class) this.f30730v).getName(), ",adapter=", String.valueOf((i0) this.f30731w), "]");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ z1(Class cls, i0 i0Var, int i) {
        this.f30729u = i;
        this.f30730v = cls;
        this.f30731w = i0Var;
    }
}
