package com.google.android.gms.internal.mlkit_vision_digital_ink;
import e0.a;
import f7.c;
import pa.e;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u implements j0 {
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final Pair a(Uri uri) {
        return n5.b(ParcelFileDescriptor.open(c(uri), 268435456));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final boolean b(Uri uri) {
        return c(uri).isDirectory();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final File c(Uri uri) {
        return c(uri);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final String d() {
        return "file";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final InputStream e(Uri uri) {
        File c10 = c(uri);
        return new z(new FileInputStream(c10), c10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final long f(Uri uri) {
        File c10 = c(uri);
        if (c10.isDirectory()) {
            return 0L;
        }
        return c10.length();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final boolean g(Uri uri) {
        return c(uri).exists();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final OutputStream h(Uri uri) {
        File c10 = c(uri);
        e(c10);
        return new a0(new FileOutputStream(c10, true), c10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final void i(Uri uri, Uri uri2) {
        File c10 = c(uri);
        File c11 = c(uri2);
        e(c11);
        if (c10.renameTo(c11)) {
        } else {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final void j(Uri uri) {
        if (c(uri).mkdirs()) {
        } else {
            throw new IOException(String.format("%s could not be created", uri));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final void k(Uri uri) {
        File c10 = c(uri);
        if (c10.isDirectory()) {
            if (c10.delete()) {
                return;
            } else {
                throw new IOException(String.format("%s could not be deleted", uri));
            }
        }
        throw new FileNotFoundException(String.format("%s is not a directory", uri));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final OutputStream l(Uri uri) {
        File c10 = c(uri);
        e(c10);
        return new a0(new FileOutputStream(c10), c10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final Iterable m(Uri uri) {
        File c10 = c(uri);
        if (c10.isDirectory()) {
            File[] listFiles = c10.listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    String absolutePath = file.getAbsolutePath();
                    if (file.isDirectory() && !absolutePath.endsWith("/")) {
                        absolutePath = absolutePath.concat("/");
                    }
                    Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
                    e4 e4Var = h4.f14393v;
                    n5.d(4, "initialCapacity");
                    path.path(absolutePath);
                    arrayList.add(path.encodedFragment(a(h4.r(new Object[4], 0))).build());
                }
                return arrayList;
            }
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", uri));
        }
        throw new FileNotFoundException(String.format("%s is not a directory", uri));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final void n(Uri uri) {
        File c10 = c(uri);
        if (!c10.isDirectory()) {
            if (!c10.delete()) {
                if (!c10.exists()) {
                    throw new FileNotFoundException(String.format("%s does not exist", uri));
                }
                throw new IOException(String.format("%s could not be deleted", uri));
            }
            return;
        }
        throw new FileNotFoundException(String.format("%s is a directory", uri));
    }
}
