package t;
import t.l0;
import t.r1;

/* loaded from: classes.dex */
public final class l0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25450u = 0;

    /* renamed from: v, reason: collision with root package name */
    public kotlin.jvm.internal.y f25451v;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.y f25452w;

    /* renamed from: x, reason: collision with root package name */
    public int f25453x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f25454y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r1 f25455z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(kotlin.jvm.internal.y yVar, r1 r1Var, te.c cVar) {
        super(2, cVar);
        this.f25452w = yVar;
        this.f25455z = r1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25450u) {
            case 0:
                l0 l0Var = new l0(this.f25452w, this.f25455z, cVar);
                l0Var.f25454y = obj;
                return l0Var;
            default:
                l0 l0Var2 = new l0(this.f25455z, cVar);
                l0Var2.f25454y = obj;
                return l0Var2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25450u) {
            case 0:
                return ((l0) create((df.l) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((l0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
    
        if (r11 != r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        if (r1.b1(r2, r10) == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f5, code lost:
    
        if (r1.b1(r2, r10) != r4) goto L12;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    /* JADX WARN: Path cross not found for [B:34:0x00d8, B:31:0x00c6], limit reached: 89 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0089 -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d3 -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00da -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e7 -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f5 -> B:9:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0149 -> B:62:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x014e -> B:63:0x014f). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(r1 r1Var, te.c cVar) {
        super(2, cVar);
        this.f25455z = r1Var;
    }
}
