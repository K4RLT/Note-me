package rf;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final p f24791a = new p(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f24792b = uf.a.j("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f24793c = uf.a.j("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final c4.s f24794d = new c4.s("BUFFERED", 8);
    public static final c4.s e = new c4.s("SHOULD_BUFFER", 8);

    /* renamed from: f, reason: collision with root package name */
    public static final c4.s f24795f = new c4.s("S_RESUMING_BY_RCV", 8);

    /* renamed from: g, reason: collision with root package name */
    public static final c4.s f24796g = new c4.s("RESUMING_BY_EB", 8);

    /* renamed from: h, reason: collision with root package name */
    public static final c4.s f24797h = new c4.s("POISONED", 8);
    public static final c4.s i = new c4.s("DONE_RCV", 8);

    /* renamed from: j, reason: collision with root package name */
    public static final c4.s f24798j = new c4.s("INTERRUPTED_SEND", 8);

    /* renamed from: k, reason: collision with root package name */
    public static final c4.s f24799k = new c4.s("INTERRUPTED_RCV", 8);

    /* renamed from: l, reason: collision with root package name */
    public static final c4.s f24800l = new c4.s("CHANNEL_CLOSED", 8);

    /* renamed from: m, reason: collision with root package name */
    public static final c4.s f24801m = new c4.s("SUSPEND", 8);

    /* renamed from: n, reason: collision with root package name */
    public static final c4.s f24802n = new c4.s("SUSPEND_NO_WAITER", 8);

    /* renamed from: o, reason: collision with root package name */
    public static final c4.s f24803o = new c4.s("FAILED", 8);

    /* renamed from: p, reason: collision with root package name */
    public static final c4.s f24804p = new c4.s("NO_RECEIVE_RESULT", 8);

    /* renamed from: q, reason: collision with root package name */
    public static final c4.s f24805q = new c4.s("CLOSE_HANDLER_CLOSED", 8);

    /* renamed from: r, reason: collision with root package name */
    public static final c4.s f24806r = new c4.s("CLOSE_HANDLER_INVOKED", 8);

    /* renamed from: s, reason: collision with root package name */
    public static final c4.s f24807s = new c4.s("NO_CLOSE_CAUSE", 8);

    public static final boolean a(pf.k kVar, Object obj, df.q qVar) {
        c4.s g8 = kVar.g(obj, qVar);
        if (g8 != null) {
            kVar.n(g8);
            return true;
        }
        return false;
    }
}
