package t;
import t.v;
import v1.b;
import v1.k;

/* loaded from: classes.dex */
public final class v extends ve.h implements df.p {
    public final /* synthetic */ kotlin.jvm.internal.y A;

    /* renamed from: u, reason: collision with root package name */
    public k f25536u;

    /* renamed from: v, reason: collision with root package name */
    public int f25537v;

    /* renamed from: w, reason: collision with root package name */
    public int f25538w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f25539x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f25540y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f25541z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kotlin.jvm.internal.u uVar, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2, te.c cVar) {
        super(2, cVar);
        this.f25540y = uVar;
        this.f25541z = yVar;
        this.A = yVar2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        v vVar = new v(this.f25540y, this.f25541z, this.A, cVar);
        vVar.f25539x = obj;
        return vVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r8 == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
    
        if (r7 == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        return r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [b] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00be -> B:6:0x00c1). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
