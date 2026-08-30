package g5;
import q.x;
import r.b;
import z.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.e f17514a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17515b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17516c;

    /* renamed from: f, reason: collision with root package name */
    public Executor f17518f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f17519g;

    /* renamed from: h, reason: collision with root package name */
    public b1.h f17520h;
    public boolean i;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17528q;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f17517d = new ArrayList();
    public final ArrayList e = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final t f17521j = t.f17530u;

    /* renamed from: k, reason: collision with root package name */
    public final long f17522k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final z5.h f17523l = new z5.h(16);

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f17524m = new LinkedHashSet();

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f17525n = new LinkedHashSet();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f17526o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public boolean f17527p = true;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f17529r = true;

    public r(Context context, Class cls, String str) {
        this.f17514a = kotlin.jvm.internal.a(cls);
        this.f17515b = context;
        this.f17516c = str;
    }

    public final void a(j5.a... aVarArr) {
        for (j5.a aVar : aVarArr) {
            Integer valueOf = Integer.valueOf(aVar.f18908a);
            LinkedHashSet linkedHashSet = this.f17525n;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(aVar.f18909b));
        }
        j5.a[] aVarArr2 = (j5.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        z5.h hVar = this.f17523l;
        hVar.getClass();
        for (j5.a aVar2 : aVarArr2) {
            hVar.e(aVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x021e, code lost:
    
        x.n("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c9 A[LOOP:6: B:118:0x029c->B:130:0x02c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g5.v b() {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.b():g5.v");
    }
}
