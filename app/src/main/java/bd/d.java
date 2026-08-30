package bd;

import java.util.Date;
import java.util.HashMap;
import zc.g;

/* loaded from: classes.dex */
public final class d implements ad.a {
    public static final b A;

    /* renamed from: z, reason: collision with root package name */
    public static final b f3200z;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f3201u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f3202v;

    /* renamed from: w, reason: collision with root package name */
    public final a f3203w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3204x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f3199y = new a(0);
    public static final c B = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [bd.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [bd.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [bd.c, java.lang.Object] */
    static {
        final int i = 0;
        f3200z = new zc.f() { // from class: bd.b
            @Override // zc.a
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        return;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i10 = 1;
        A = new zc.f() { // from class: bd.b
            @Override // zc.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        return;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f3201u = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f3202v = hashMap2;
        this.f3203w = f3199y;
        this.f3204x = false;
        hashMap2.put(String.class, f3200z);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, A);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, B);
        hashMap.remove(Date.class);
    }

    @Override // ad.a
    public final ad.a a(Class cls, zc.d dVar) {
        this.f3201u.put(cls, dVar);
        this.f3202v.remove(cls);
        return this;
    }
}
