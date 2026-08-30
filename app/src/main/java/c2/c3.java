package c2;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.ads.bj0;
import com.google.android.gms.internal.measurement.b4;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3494b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(j.e0 e0Var) {
        super(new Handler());
        this.f3493a = 3;
        this.f3494b = e0Var;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f3493a) {
            case 3:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3) {
        Cursor cursor;
        switch (this.f3493a) {
            case 1:
                ((AtomicBoolean) ((bj0) this.f3494b).f4805v).set(true);
                return;
            case 2:
                b4 b4Var = (b4) this.f3494b;
                synchronized (b4Var.f13652y) {
                    b4Var.f13653z = null;
                    b4Var.f13650w.run();
                }
                synchronized (b4Var) {
                    try {
                        Iterator it = b4Var.A.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 3:
                j.e0 e0Var = (j.e0) this.f3494b;
                if (e0Var.f27378v && (cursor = e0Var.f27379w) != null && !cursor.isClosed()) {
                    e0Var.f27377u = e0Var.f27379w.requery();
                    return;
                }
                return;
            default:
                super.onChange(z3);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(rf.h hVar, Handler handler) {
        super(handler);
        this.f3493a = 0;
        this.f3494b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(int i, Object obj) {
        super(null);
        this.f3493a = i;
        this.f3494b = obj;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3, Uri uri) {
        switch (this.f3493a) {
            case 0:
                ((rf.h) this.f3494b).e(pe.z.f22715a);
                return;
            default:
                super.onChange(z3, uri);
                return;
        }
    }
}
