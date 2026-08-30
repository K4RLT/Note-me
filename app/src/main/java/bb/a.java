package bb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3164a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Looper looper, int i) {
        super(looper);
        this.f3164a = i;
        switch (i) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                return;
            case 3:
                super(looper);
                Looper.getMainLooper();
                return;
            case 4:
            default:
                Looper.getMainLooper();
                return;
            case 5:
                super(looper);
                Looper.getMainLooper();
                return;
        }
    }

    public void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        switch (this.f3164a) {
            case 1:
                a(message);
                return;
            default:
                super.dispatchMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.f3164a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Looper looper, int i, boolean z3) {
        super(looper);
        this.f3164a = i;
    }
}
