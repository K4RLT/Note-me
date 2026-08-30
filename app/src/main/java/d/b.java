package d;

import java.util.UUID;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class b extends m implements df.a {

    /* renamed from: v, reason: collision with root package name */
    public static final b f15633v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f15634w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f15635x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15636u;

    static {
        int i = 0;
        f15633v = new b(i, 0);
        f15634w = new b(i, 1);
        f15635x = new b(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i10) {
        super(i);
        this.f15636u = i10;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f15636u) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
