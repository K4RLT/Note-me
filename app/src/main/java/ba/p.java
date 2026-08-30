package ba;

/* loaded from: classes.dex */
public final class p extends Exception {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3155u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, Throwable th) {
        super(str, th);
        this.f3155u = 0;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f3155u) {
            case 5:
                synchronized (this) {
                    setStackTrace(new StackTraceElement[0]);
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, int i) {
        super(str);
        this.f3155u = i;
    }
}
