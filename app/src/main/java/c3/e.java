package c3;

import java.util.UUID;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: v, reason: collision with root package name */
    public static final e f3762v;

    /* renamed from: w, reason: collision with root package name */
    public static final e f3763w;

    /* renamed from: x, reason: collision with root package name */
    public static final e f3764x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3765u;

    static {
        int i = 0;
        f3762v = new e(i, 0);
        f3763w = new e(i, 1);
        f3764x = new e(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i10) {
        super(i);
        this.f3765u = i10;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f3765u) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
