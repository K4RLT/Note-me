package kg;
import a.a;

import ig.o;
import ig.v;
import ig.w;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19776a;

    public /* synthetic */ a(int i) {
        this.f19776a = i;
    }

    public static boolean b(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static w c(w wVar) {
        if (wVar != null && wVar.A != null) {
            v j10 = wVar.j();
            j10.f18591g = null;
            return j10.a();
        }
        return wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x016a  */
    @Override // ig.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ig.w a(mg.e r30) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.a.a(mg.e):ig.w");
    }
}
