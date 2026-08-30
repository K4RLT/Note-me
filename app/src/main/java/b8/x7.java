package b8;
import b.a;
import p5.a;
import p5.c;
import u7.b;

/* loaded from: classes.dex */
public final /* synthetic */ class x7 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2983u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2984v;

    public /* synthetic */ x7(int i, int i10) {
        this.f2983u = i10;
        this.f2984v = i;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f2983u) {
            case 0:
                return Integer.valueOf((((Integer) obj).intValue() * this.f2984v) / 5);
            case 1:
                return Integer.valueOf(((-this.f2984v) * ((Integer) obj).intValue()) / 8);
            case 2:
                return Integer.valueOf((((Integer) obj).intValue() * this.f2984v) / 5);
            case 3:
                return Integer.valueOf(((-this.f2984v) * ((Integer) obj).intValue()) / 8);
            case 4:
                int i = this.f2984v;
                a aVar = (a) obj;
                aVar.getClass();
                c T = aVar.T("UPDATE notebooks SET orderIndex = orderIndex + 1 WHERE orderIndex >= ?");
                try {
                    T.b(1, i);
                    T.P();
                    T.close();
                    return pe.z.f22715a;
                } catch (Throwable th) {
                    T.close();
                    throw th;
                }
            case 5:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f2984v + '.');
            default:
                b bVar = (b) obj;
                bVar.getClass();
                return b.a(bVar, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, false, null, Integer.valueOf(this.f2984v), null, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 4192255);
        }
    }
}
