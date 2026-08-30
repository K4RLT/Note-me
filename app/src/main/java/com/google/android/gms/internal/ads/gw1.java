package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public abstract class gw1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y51 f6490a = d51.q(12);

    public static d51 a(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles;
        int encapsulationType;
        int format;
        int[] channelMasks;
        audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(yu1.f12973c).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile f10 = ru1.f(it.next());
            encapsulationType = f10.getEncapsulationType();
            if (encapsulationType != 1) {
                format = f10.getFormat();
                if (bq0.d(format)) {
                    channelMasks = f10.getChannelMasks();
                    for (int i : channelMasks) {
                        treeSet.add(Integer.valueOf(i));
                    }
                }
            }
        }
        return d51.u(treeSet);
    }
}
