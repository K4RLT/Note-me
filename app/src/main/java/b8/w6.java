package b8;
import b8.w6;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class w6 extends ve.i implements df.p {
    public long A;
    public int B;
    public final /* synthetic */ Context C;

    /* renamed from: u, reason: collision with root package name */
    public Context f2929u;

    /* renamed from: v, reason: collision with root package name */
    public d1 f2930v;

    /* renamed from: w, reason: collision with root package name */
    public SharedPreferences f2931w;

    /* renamed from: x, reason: collision with root package name */
    public List f2932x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f2933y;

    /* renamed from: z, reason: collision with root package name */
    public ca f2934z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(Context context, te.c cVar) {
        super(2, cVar);
        this.C = context;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new w6(this.C, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w6) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x023f, code lost:
    
        if (r2 == r4) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014b A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:74:0x0242, B:78:0x024d, B:80:0x0267, B:82:0x0275, B:18:0x0138, B:19:0x0145, B:21:0x014b, B:23:0x015e, B:29:0x016c, B:35:0x0170, B:39:0x017d, B:42:0x0187, B:44:0x0193, B:47:0x01a4, B:52:0x01a8, B:57:0x01b6, B:59:0x01bc, B:61:0x01d2, B:63:0x01e0, B:66:0x01fb, B:72:0x0214, B:6:0x0053, B:8:0x00fb, B:13:0x010b, B:114:0x00b3, B:116:0x00b7, B:118:0x00c0, B:123:0x00de), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017d A[Catch: all -> 0x005d, TRY_ENTER, TryCatch #0 {all -> 0x005d, blocks: (B:74:0x0242, B:78:0x024d, B:80:0x0267, B:82:0x0275, B:18:0x0138, B:19:0x0145, B:21:0x014b, B:23:0x015e, B:29:0x016c, B:35:0x0170, B:39:0x017d, B:42:0x0187, B:44:0x0193, B:47:0x01a4, B:52:0x01a8, B:57:0x01b6, B:59:0x01bc, B:61:0x01d2, B:63:0x01e0, B:66:0x01fb, B:72:0x0214, B:6:0x0053, B:8:0x00fb, B:13:0x010b, B:114:0x00b3, B:116:0x00b7, B:118:0x00c0, B:123:0x00de), top: B:2:0x0015 }] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.w6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
