package ig;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class s extends sg.d {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f18576j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f18577k;

    public /* synthetic */ s(int i, Object obj) {
        this.f18576j = i;
        this.f18577k = obj;
    }

    @Override // sg.d
    public IOException m(IOException iOException) {
        switch (this.f18576j) {
            case 1:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            default:
                return super.m(iOException);
        }
    }

    @Override // sg.d
    public final void n() {
        switch (this.f18576j) {
            case 0:
                ((u) this.f18577k).a();
                return;
            default:
                og.w wVar = (og.w) this.f18577k;
                if (wVar.d(6)) {
                    wVar.f22068d.B(wVar.f22067c, 6);
                    return;
                }
                return;
        }
    }

    public void o() {
        if (!k()) {
        } else {
            throw m(null);
        }
    }
}
