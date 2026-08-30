package com.google.mlkit.vision.digitalink.common.downloading;

import g5.q;
import java.util.List;
import xa.g;
import xa.i;
import xa.o;

/* loaded from: classes.dex */
public final class DigitalInkManifestParser$Pack {
    private int compressedSize;
    private String downloadPackingScheme;
    private List<String> downloadUrls;
    private String md5Checksum;
    private String name;
    private String sha1Checksum;
    private int size;

    public DigitalInkManifestParser$Pack(String str, String str2, int i, String str3) {
        this.name = str;
        Object[] objArr = {str2};
        for (int i10 = 0; i10 <= 0; i10++) {
            g gVar = i.f30429v;
            if (objArr[i10] == null) {
                q.h(g3.a.g(i10, "at index "));
                throw null;
            }
        }
        g gVar2 = i.f30429v;
        this.downloadUrls = new o(objArr, 1);
        this.compressedSize = i;
        this.sha1Checksum = str3;
    }

    public int getCompressedSize() {
        return this.compressedSize;
    }

    public String getDownloadPackingScheme() {
        return this.downloadPackingScheme;
    }

    public List<String> getDownloadUrls() {
        return this.downloadUrls;
    }

    public String getMd5Checksum() {
        return this.md5Checksum;
    }

    public String getName() {
        return this.name;
    }

    public String getSha1Checksum() {
        return this.sha1Checksum;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isValid() {
        String str;
        List<String> list = this.downloadUrls;
        if (list != null && !list.isEmpty() && this.compressedSize > 0 && (str = this.name) != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    public DigitalInkManifestParser$Pack() {
    }
}
