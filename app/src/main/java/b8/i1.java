package b8;
import b8.i1;
import r0.a1;
import r0.f1;
import u7.b;
import u7.l2;
import u7.m3;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class i1 extends ve.i implements df.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2184u = 2;

    /* renamed from: v, reason: collision with root package name */
    public int f2185v;

    /* renamed from: w, reason: collision with root package name */
    public int f2186w;

    /* renamed from: x, reason: collision with root package name */
    public int f2187x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2188y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2189z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(kotlin.jvm.internal.y yVar, b bVar, m3 m3Var, int i, int i10, df.l lVar, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.f2189z = yVar;
        this.A = bVar;
        this.f2188y = m3Var;
        this.f2186w = i;
        this.f2187x = i10;
        this.B = lVar;
        this.C = a1Var;
    }

    public static final boolean j(q.d dVar, q.d dVar2) {
        if (((Number) dVar.e()).floatValue() > 0.999f && !dVar.f() && ((Number) dVar2.e()).floatValue() > 0.999f && !dVar2.f()) {
            return true;
        }
        return false;
    }

    public static final boolean k(q.d dVar, q.d dVar2) {
        if (((Number) dVar.e()).floatValue() < 0.001f && !dVar.f() && ((Number) dVar2.e()).floatValue() < 0.001f && !dVar2.f()) {
            return true;
        }
        return false;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2184u) {
            case 0:
                return new i1((m3) this.f2188y, (String) this.f2189z, (Context) this.B, (String) this.A, this.f2187x, (File) this.C, cVar);
            case 1:
                return new i1((l2) this.f2189z, (f1) this.A, (q.d) this.B, (q.d) this.C, cVar);
            case 2:
                return new i1((kotlin.jvm.internal.y) this.f2189z, (b) this.A, (m3) this.f2188y, this.f2186w, this.f2187x, (df.l) this.B, (a1) this.C, cVar);
            default:
                return new i1((m3) this.f2188y, this.f2186w, this.f2187x, (kotlin.jvm.internal.v) this.f2189z, (kotlin.jvm.internal.v) this.A, (w7.a5) this.C, (Context) this.B, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2184u) {
            case 0:
                return ((i1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                ((i1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            case 2:
                return ((i1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((i1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
//         jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0338 A[Catch: all -> 0x033b, TRY_LEAVE, TryCatch #6 {all -> 0x033b, blocks: (B:149:0x031a, B:151:0x0338), top: B:148:0x031a }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0150 -> B:61:0x0278). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01f2 -> B:45:0x01f6). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.i1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(l2 l2Var, f1 f1Var, q.d dVar, q.d dVar2, te.c cVar) {
        super(2, cVar);
        this.f2189z = l2Var;
        this.A = f1Var;
        this.B = dVar;
        this.C = dVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(m3 m3Var, int i, int i10, kotlin.jvm.internal.v vVar, kotlin.jvm.internal.v vVar2, w7.a5 a5Var, Context context, te.c cVar) {
        super(2, cVar);
        this.f2188y = m3Var;
        this.f2186w = i;
        this.f2187x = i10;
        this.f2189z = vVar;
        this.A = vVar2;
        this.C = a5Var;
        this.B = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(m3 m3Var, String str, Context context, String str2, int i, File file, te.c cVar) {
        super(2, cVar);
        this.f2188y = m3Var;
        this.f2189z = str;
        this.B = context;
        this.A = str2;
        this.f2187x = i;
        this.C = file;
    }
}
