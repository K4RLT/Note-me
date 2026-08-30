package h7;

import android.content.Context;
import android.net.Uri;
import df.p;
import j7.q;
import java.io.File;
import java.util.ArrayList;
import pf.z;

/* loaded from: classes.dex */
public final class i extends ve.i implements p {
    public File A;
    public String B;
    public f C;
    public Object D;
    public Object E;
    public String F;
    public String G;
    public ArrayList H;
    public int I;
    public int J;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ Context M;
    public final /* synthetic */ Uri N;
    public final /* synthetic */ j7.l O;
    public final /* synthetic */ String P;
    public final /* synthetic */ q Q;
    public final /* synthetic */ j7.f R;

    /* renamed from: u, reason: collision with root package name */
    public Context f17893u;

    /* renamed from: v, reason: collision with root package name */
    public j7.l f17894v;

    /* renamed from: w, reason: collision with root package name */
    public Object f17895w;

    /* renamed from: x, reason: collision with root package name */
    public Object f17896x;

    /* renamed from: y, reason: collision with root package name */
    public Object f17897y;

    /* renamed from: z, reason: collision with root package name */
    public File f17898z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, Uri uri, j7.l lVar, String str, q qVar, j7.f fVar, te.c cVar) {
        super(2, cVar);
        this.M = context;
        this.N = uri;
        this.O = lVar;
        this.P = str;
        this.Q = qVar;
        this.R = fVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        i iVar = new i(this.M, this.N, this.O, this.P, this.Q, this.R, cVar);
        iVar.L = obj;
        return iVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|2|(3:(1:(1:(1:(10:8|9|10|11|(3:13|(3:15|16|17)(1:19)|18)|20|21|22|23|24)(2:27|28))(17:29|30|31|32|(2:34|35)(1:95)|36|37|(1:39)|40|(5:43|44|(3:46|47|(3:54|55|56)(2:51|52))(2:57|(2:59|60)(2:61|62))|53|41)|63|64|(4:66|(1:68)|69|(3:71|(1:73)|74))|75|(4:77|(1:79)|80|(3:82|(1:84)|85))|86|(1:89)(8:88|11|(0)|20|21|22|23|24)))(6:96|97|98|99|(1:101)|(21:103|104|105|106|107|108|(3:110|111|112)|32|(0)(0)|36|37|(0)|40|(1:41)|63|64|(0)|75|(0)|86|(0)(0))(12:119|37|(0)|40|(1:41)|63|64|(0)|75|(0)|86|(0)(0))))(4:123|124|125|126)|93|94)(4:142|143|144|(8:146|147|148|149|(2:151|(4:153|(1:155)(6:158|(1:160)|161|162|163|164)|156|157)(3:174|175|176))|177|178|(2:180|(2:182|(4:184|(1:186)|111|112)(2:187|188))(2:189|190))(2:191|192))(2:201|202))|127|128|(9:130|131|132|133|134|135|(3:137|(0)|(0)(0))|111|112)(21:138|104|105|106|107|108|(0)|32|(0)(0)|36|37|(0)|40|(1:41)|63|64|(0)|75|(0)|86|(0)(0))|(3:(1:170)|(0)|(1:197))) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02e9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x055f A[Catch: all -> 0x0053, TryCatch #7 {all -> 0x0053, blocks: (B:9:0x004d, B:11:0x0551, B:13:0x055f, B:16:0x056d, B:21:0x0571, B:37:0x0359, B:39:0x0393, B:40:0x0396, B:41:0x03ad, B:43:0x03b3, B:46:0x03e2, B:49:0x03f9, B:51:0x0402, B:53:0x0465, B:55:0x0420, B:57:0x0436, B:59:0x0442, B:61:0x045a, B:64:0x047c, B:66:0x048d, B:68:0x049c, B:69:0x049f, B:71:0x04a5, B:73:0x04a9, B:75:0x04c3, B:77:0x04ce, B:79:0x04dd, B:80:0x04e0, B:82:0x04e6, B:84:0x04ea, B:86:0x0504), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0336 A[Catch: all -> 0x0348, TRY_LEAVE, TryCatch #9 {all -> 0x0348, blocks: (B:32:0x032c, B:34:0x0336, B:108:0x0321, B:135:0x02bb), top: B:134:0x02bb }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0393 A[Catch: all -> 0x0053, TryCatch #7 {all -> 0x0053, blocks: (B:9:0x004d, B:11:0x0551, B:13:0x055f, B:16:0x056d, B:21:0x0571, B:37:0x0359, B:39:0x0393, B:40:0x0396, B:41:0x03ad, B:43:0x03b3, B:46:0x03e2, B:49:0x03f9, B:51:0x0402, B:53:0x0465, B:55:0x0420, B:57:0x0436, B:59:0x0442, B:61:0x045a, B:64:0x047c, B:66:0x048d, B:68:0x049c, B:69:0x049f, B:71:0x04a5, B:73:0x04a9, B:75:0x04c3, B:77:0x04ce, B:79:0x04dd, B:80:0x04e0, B:82:0x04e6, B:84:0x04ea, B:86:0x0504), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03b3 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #7 {all -> 0x0053, blocks: (B:9:0x004d, B:11:0x0551, B:13:0x055f, B:16:0x056d, B:21:0x0571, B:37:0x0359, B:39:0x0393, B:40:0x0396, B:41:0x03ad, B:43:0x03b3, B:46:0x03e2, B:49:0x03f9, B:51:0x0402, B:53:0x0465, B:55:0x0420, B:57:0x0436, B:59:0x0442, B:61:0x045a, B:64:0x047c, B:66:0x048d, B:68:0x049c, B:69:0x049f, B:71:0x04a5, B:73:0x04a9, B:75:0x04c3, B:77:0x04ce, B:79:0x04dd, B:80:0x04e0, B:82:0x04e6, B:84:0x04ea, B:86:0x0504), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x048d A[Catch: all -> 0x0053, TryCatch #7 {all -> 0x0053, blocks: (B:9:0x004d, B:11:0x0551, B:13:0x055f, B:16:0x056d, B:21:0x0571, B:37:0x0359, B:39:0x0393, B:40:0x0396, B:41:0x03ad, B:43:0x03b3, B:46:0x03e2, B:49:0x03f9, B:51:0x0402, B:53:0x0465, B:55:0x0420, B:57:0x0436, B:59:0x0442, B:61:0x045a, B:64:0x047c, B:66:0x048d, B:68:0x049c, B:69:0x049f, B:71:0x04a5, B:73:0x04a9, B:75:0x04c3, B:77:0x04ce, B:79:0x04dd, B:80:0x04e0, B:82:0x04e6, B:84:0x04ea, B:86:0x0504), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04ce A[Catch: all -> 0x0053, TryCatch #7 {all -> 0x0053, blocks: (B:9:0x004d, B:11:0x0551, B:13:0x055f, B:16:0x056d, B:21:0x0571, B:37:0x0359, B:39:0x0393, B:40:0x0396, B:41:0x03ad, B:43:0x03b3, B:46:0x03e2, B:49:0x03f9, B:51:0x0402, B:53:0x0465, B:55:0x0420, B:57:0x0436, B:59:0x0442, B:61:0x045a, B:64:0x047c, B:66:0x048d, B:68:0x049c, B:69:0x049f, B:71:0x04a5, B:73:0x04a9, B:75:0x04c3, B:77:0x04ce, B:79:0x04dd, B:80:0x04e0, B:82:0x04e6, B:84:0x04ea, B:86:0x0504), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x034a  */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v63 */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
