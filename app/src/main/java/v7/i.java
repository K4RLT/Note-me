package v7;

import android.content.Context;
import df.p;
import java.io.File;
import nd.o;
import pf.z;

/* loaded from: classes.dex */
public final class i extends ve.i implements p {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ Context D;
    public final /* synthetic */ o E;

    /* renamed from: u, reason: collision with root package name */
    public File f27433u;

    /* renamed from: v, reason: collision with root package name */
    public File[] f27434v;

    /* renamed from: w, reason: collision with root package name */
    public int f27435w;

    /* renamed from: x, reason: collision with root package name */
    public int f27436x;

    /* renamed from: y, reason: collision with root package name */
    public int f27437y;

    /* renamed from: z, reason: collision with root package name */
    public int f27438z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, o oVar, te.c cVar) {
        super(2, cVar);
        this.D = context;
        this.E = oVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        i iVar = new i(this.D, this.E, cVar);
        iVar.C = obj;
        return iVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:42|(1:43)|44|45|(1:47)|48|49|51|52|53|54|55|(3:75|76|77)(4:63|64|(1:66)|67)|68|(1:70)(5:72|5|6|7|(4:102|(1:104)|105|106)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0181, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01e0 -> B:5:0x01e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01f1 -> B:6:0x01e6). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
