package u7;

import java.util.List;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: f, reason: collision with root package name */
    public static final g1 f26211f = new g1(qe.m.g(""), qe.m.g(""), new int[0], new int[0], new int[][]{new int[0]});

    /* renamed from: a, reason: collision with root package name */
    public final List f26212a;

    /* renamed from: b, reason: collision with root package name */
    public final List f26213b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f26214c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f26215d;
    public final int[][] e;

    public g1(List list, List list2, int[] iArr, int[] iArr2, int[][] iArr3) {
        this.f26212a = list;
        this.f26213b = list2;
        this.f26214c = iArr;
        this.f26215d = iArr2;
        this.e = iArr3;
    }

    public final String a(int i) {
        return (String) qe.l.y(i, this.f26212a);
    }

    public final int b(int i) {
        if (i >= 0) {
            int[] iArr = this.f26215d;
            if (i < iArr.length) {
                return iArr[i];
            }
            return 0;
        }
        return 0;
    }

    public final int c(int i) {
        int[] iArr = (int[]) qe.k.o(this.e, i);
        if (iArr != null) {
            return iArr.length;
        }
        return 0;
    }

    public final int d(int i) {
        if (i >= 0) {
            int[] iArr = this.f26214c;
            if (i < iArr.length) {
                return iArr[i];
            }
            return 0;
        }
        return 0;
    }
}
