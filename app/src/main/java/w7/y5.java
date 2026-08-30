package w7;
import j.i0;
import r0.o1;
import w7.y5;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y5 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29496u = 2;

    /* renamed from: v, reason: collision with root package name */
    public int f29497v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f29498w;

    /* renamed from: x, reason: collision with root package name */
    public Object f29499x;

    /* renamed from: y, reason: collision with root package name */
    public Object f29500y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f29501z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(i0 i0Var, Map map, y5 y5Var, b8.r7 r7Var, te.c cVar) {
        super(2, cVar);
        this.f29499x = i0Var;
        this.f29498w = map;
        this.f29500y = y5Var;
        this.f29501z = r7Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f29496u) {
            case 0:
                y5 y5Var = new y5((t9) this.f29500y, (Context) this.f29501z, cVar);
                y5Var.f29498w = obj;
                return y5Var;
            case 1:
                y5 y5Var2 = new y5((xd.b) this.f29501z, cVar);
                y5Var2.f29498w = obj;
                return y5Var2;
            default:
                return new y5((i0) this.f29499x, this.f29498w, (y5) this.f29500y, (b8.r7) this.f29501z, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29496u) {
            case 0:
                return ((y5) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((y5) create((JSONObject) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((y5) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00f3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dd  */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.Map, java.lang.Object] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.y5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(t9 t9Var, Context context, te.c cVar) {
        super(2, cVar);
        this.f29500y = t9Var;
        this.f29501z = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(xd.b bVar, te.c cVar) {
        super(2, cVar);
        this.f29501z = bVar;
    }
}
