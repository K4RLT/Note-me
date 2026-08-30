package x5;

import android.os.Parcel;
import android.util.SparseIntArray;
import n.e;
import n.r0;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f30084d;
    public final Parcel e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30085f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30086g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30087h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f30088j;

    /* renamed from: k, reason: collision with root package name */
    public int f30089k;

    /* JADX WARN: Type inference failed for: r5v0, types: [n.e, n.r0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [n.e, n.r0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [n.e, n.r0] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new r0(0), new r0(0), new r0(0));
    }

    @Override // x5.a
    public final b a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.f30088j;
        if (i == this.f30085f) {
            i = this.f30086g;
        }
        return new b(parcel, dataPosition, i, a5.a.k(new StringBuilder(), this.f30087h, "  "), this.f30081a, this.f30082b, this.f30083c);
    }

    @Override // x5.a
    public final boolean e(int i) {
        while (true) {
            int i10 = this.f30088j;
            int i11 = this.f30089k;
            if (i10 < this.f30086g) {
                if (i11 != i) {
                    if (String.valueOf(i11).compareTo(String.valueOf(i)) <= 0) {
                        int i12 = this.f30088j;
                        Parcel parcel = this.e;
                        parcel.setDataPosition(i12);
                        int readInt = parcel.readInt();
                        this.f30089k = parcel.readInt();
                        this.f30088j += readInt;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                if (i11 == i) {
                    return true;
                }
                return false;
            }
        }
    }

    @Override // x5.a
    public final void h(int i) {
        int i10 = this.i;
        SparseIntArray sparseIntArray = this.f30084d;
        Parcel parcel = this.e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i10, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f30084d = new SparseIntArray();
        this.i = -1;
        this.f30089k = -1;
        this.e = parcel;
        this.f30085f = i;
        this.f30086g = i10;
        this.f30088j = i;
        this.f30087h = str;
    }
}
