package ja;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import wa.d7;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = d7.p(parcel);
        ArrayList arrayList = null;
        String str = null;
        boolean z3 = false;
        String str2 = null;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            d7.o(parcel, readInt);
                        } else {
                            str = d7.d(parcel, readInt);
                        }
                    } else {
                        str2 = d7.d(parcel, readInt);
                    }
                } else {
                    z3 = d7.j(parcel, readInt);
                }
            } else {
                arrayList = d7.h(parcel, readInt, ca.d.CREATOR);
            }
        }
        d7.i(parcel, p10);
        return new a(arrayList, z3, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new a[i];
    }
}
