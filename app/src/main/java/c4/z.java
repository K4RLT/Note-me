package c4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f3877d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f3878a;

    /* renamed from: b, reason: collision with root package name */
    public final j6.n f3879b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f3880c = 0;

    public z(j6.n nVar, int i) {
        this.f3879b = nVar;
        this.f3878a = i;
    }

    public final int a(int i) {
        d4.a b10 = b();
        int a10 = b10.a(16);
        if (a10 != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b10.f15727x;
            int i10 = a10 + b10.f15724u;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i10) + i10 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, d4.c] */
    public final d4.a b() {
        ThreadLocal threadLocal = f3877d;
        d4.a aVar = (d4.a) threadLocal.get();
        d4.a aVar2 = aVar;
        if (aVar == null) {
            d4.c cVar = new d4.c();
            threadLocal.set(cVar);
            aVar2 = cVar;
        }
        d4.b bVar = (d4.b) this.f3879b.f18938v;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i = a10 + bVar.f15724u;
            int i10 = (this.f3878a * 4) + ((ByteBuffer) bVar.f15727x).getInt(i) + i + 4;
            int i11 = ((ByteBuffer) bVar.f15727x).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f15727x;
            aVar2.f15727x = byteBuffer;
            if (byteBuffer != null) {
                aVar2.f15724u = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar2.f15725v = i12;
                aVar2.f15726w = ((ByteBuffer) aVar2.f15727x).getShort(i12);
                return aVar2;
            }
            aVar2.f15724u = 0;
            aVar2.f15725v = 0;
            aVar2.f15726w = 0;
        }
        return aVar2;
    }

    public final String toString() {
        int i;
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        d4.a b10 = b();
        int a10 = b10.a(4);
        if (a10 != 0) {
            i = ((ByteBuffer) b10.f15727x).getInt(a10 + b10.f15724u);
        } else {
            i = 0;
        }
        sb2.append(Integer.toHexString(i));
        sb2.append(", codepoints:");
        d4.a b11 = b();
        int a11 = b11.a(16);
        if (a11 != 0) {
            int i11 = a11 + b11.f15724u;
            i10 = ((ByteBuffer) b11.f15727x).getInt(((ByteBuffer) b11.f15727x).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(Integer.toHexString(a(i12)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}