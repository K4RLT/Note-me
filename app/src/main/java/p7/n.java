package p7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r0.a1;

/* loaded from: classes.dex */
public final class n extends ve.i implements df.p {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public double J;
    public int K;
    public final /* synthetic */ b1.v L;
    public final /* synthetic */ float M;
    public final /* synthetic */ float N;
    public final /* synthetic */ float O;
    public final /* synthetic */ w7.j0 P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ a1 R;
    public final /* synthetic */ a1 S;
    public final /* synthetic */ a1 T;
    public final /* synthetic */ a1 U;
    public final /* synthetic */ a1 V;

    /* renamed from: u, reason: collision with root package name */
    public List f22537u;

    /* renamed from: v, reason: collision with root package name */
    public Iterator f22538v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f22539w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f22540x;

    /* renamed from: y, reason: collision with root package name */
    public String f22541y;

    /* renamed from: z, reason: collision with root package name */
    public Iterator f22542z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b1.v vVar, float f10, float f11, float f12, w7.j0 j0Var, String str, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, te.c cVar) {
        super(2, cVar);
        this.L = vVar;
        this.M = f10;
        this.N = f11;
        this.O = f12;
        this.P = j0Var;
        this.Q = str;
        this.R = a1Var;
        this.S = a1Var2;
        this.T = a1Var3;
        this.U = a1Var4;
        this.V = a1Var5;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new n(this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x03a7, code lost:
    
        r24 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020c A[Catch: all -> 0x0265, TryCatch #0 {all -> 0x0265, blocks: (B:10:0x035c, B:12:0x0360, B:14:0x0371, B:15:0x0379, B:17:0x0382, B:19:0x038c, B:21:0x0392, B:28:0x03af, B:30:0x03b5, B:39:0x03e3, B:41:0x0204, B:43:0x020c, B:44:0x0222, B:46:0x0228, B:47:0x0232, B:49:0x0238, B:55:0x0252, B:66:0x026a, B:69:0x0279, B:70:0x0298, B:72:0x029e, B:73:0x02b9, B:75:0x02bf, B:77:0x02ea, B:79:0x02fa, B:85:0x041e, B:87:0x042e, B:94:0x04e8, B:97:0x0504, B:100:0x050f, B:32:0x03c8, B:23:0x03a0), top: B:9:0x035c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x041e A[Catch: all -> 0x0265, TryCatch #0 {all -> 0x0265, blocks: (B:10:0x035c, B:12:0x0360, B:14:0x0371, B:15:0x0379, B:17:0x0382, B:19:0x038c, B:21:0x0392, B:28:0x03af, B:30:0x03b5, B:39:0x03e3, B:41:0x0204, B:43:0x020c, B:44:0x0222, B:46:0x0228, B:47:0x0232, B:49:0x0238, B:55:0x0252, B:66:0x026a, B:69:0x0279, B:70:0x0298, B:72:0x029e, B:73:0x02b9, B:75:0x02bf, B:77:0x02ea, B:79:0x02fa, B:85:0x041e, B:87:0x042e, B:94:0x04e8, B:97:0x0504, B:100:0x050f, B:32:0x03c8, B:23:0x03a0), top: B:9:0x035c }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04e0  */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x01e6 -> B:37:0x0204). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0352 -> B:9:0x035c). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 1315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
