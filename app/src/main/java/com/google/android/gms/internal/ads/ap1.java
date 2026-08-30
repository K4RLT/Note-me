package com.google.android.gms.internal.ads;
import a5.a;

import android.media.AudioDescriptor;
import android.os.Build;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public abstract class ap1 {
    public static d51 a(List list) {
        int standard;
        byte[] descriptor;
        if (Build.VERSION.SDK_INT >= 31 && list != null) {
            TreeSet treeSet = new TreeSet(Comparator.comparing(yu1.f12972b).reversed());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AudioDescriptor e = ru1.e(it.next());
                standard = e.getStandard();
                if (standard == 1) {
                    descriptor = e.getDescriptor();
                    int length = descriptor.length;
                    if (length != 3) {
                        a5.a.t(new StringBuilder(String.valueOf(length).length() + 20), "Invalid SAD length: ", length, "AudioDescriptorUtil");
                    } else {
                        byte b10 = descriptor[0];
                        int i = (b10 & 7) + 1;
                        if (((b10 >> 3) & 15) == 1) {
                            treeSet.add(Integer.valueOf(bq0.e(i)));
                        }
                    }
                }
            }
            return d51.u(treeSet);
        }
        b51 b51Var = d51.f5314v;
        return y51.f12781y;
    }

    public static boolean b(byte b10) {
        return b10 > -65;
    }
}
