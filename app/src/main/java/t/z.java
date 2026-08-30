package t;
import t.z;
import v1.b;
import v1.t;

import com.google.android.gms.internal.ads.f3;

/* loaded from: classes.dex */
public final class z extends ve.h implements df.p {
    public boolean A;
    public float B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ kotlin.jvm.internal.m E;
    public final /* synthetic */ kotlin.jvm.internal.x F;
    public final /* synthetic */ z0 G;
    public final /* synthetic */ kotlin.jvm.internal.m H;
    public final /* synthetic */ df.p I;
    public final /* synthetic */ df.a J;
    public final /* synthetic */ kotlin.jvm.internal.m K;

    /* renamed from: u, reason: collision with root package name */
    public Object f25591u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25592v;

    /* renamed from: w, reason: collision with root package name */
    public Object f25593w;

    /* renamed from: x, reason: collision with root package name */
    public kotlin.jvm.internal.x f25594x;

    /* renamed from: y, reason: collision with root package name */
    public f3 f25595y;

    /* renamed from: z, reason: collision with root package name */
    public t f25596z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(df.a aVar, kotlin.jvm.internal.x xVar, z0 z0Var, df.q qVar, df.p pVar, df.a aVar2, df.l lVar, te.c cVar) {
        super(2, cVar);
        this.E = (kotlin.jvm.internal.m) aVar;
        this.F = xVar;
        this.G = z0Var;
        this.H = (kotlin.jvm.internal.m) qVar;
        this.I = pVar;
        this.J = aVar2;
        this.K = (kotlin.jvm.internal.m) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.internal.m, df.q] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.m, df.l] */
    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        z zVar = new z(this.E, this.F, this.G, this.H, this.I, this.J, this.K, cVar);
        zVar.D = obj;
        return zVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x01d3, code lost:
    
        if (r13 == r14) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04cd, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x017e, code lost:
    
        if (r5 == r14) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0159, code lost:
    
        if (r3 == r14) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0552, code lost:
    
        if (r3 == 0.0f) goto L207;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x032a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x04dc  */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r1v44, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v12, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r6v27, types: [kotlin.jvm.internal.m, df.q] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x036a -> B:59:0x0383). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x046b -> B:72:0x02b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x040b -> B:58:0x0434). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0430 -> B:58:0x0434). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0453 -> B:56:0x0457). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x019a -> B:141:0x019d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x0216 -> B:141:0x019d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x0261 -> B:142:0x029d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x028e -> B:138:0x0294). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x04cb -> B:7:0x04ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0321 -> B:78:0x02d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0362 -> B:69:0x0365). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
