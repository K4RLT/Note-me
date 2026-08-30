package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.app.blob.BlobHandle;
import android.app.blob.BlobStoreManager;
import android.content.Context;
import android.net.Uri;
import android.os.LimitExceededException;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final BlobStoreManager f14825a;

    public q(Context context) {
        this.f14825a = c2.z1.g(context.getSystemService("blob_store"));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final Pair a(Uri uri) {
        return n5.b(o(uri));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final boolean b(Uri uri) {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final File c(Uri uri) {
        throw new IOException("Cannot convert uri to file blobstore ".concat(String.valueOf(uri)));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final String d() {
        return "blobstore";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final InputStream e(Uri uri) {
        return new ParcelFileDescriptor.AutoCloseInputStream(o(uri));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final long f(Uri uri) {
        throw new IOException("fileSize not supported by blobstore");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final boolean g(Uri uri) {
        boolean z3 = false;
        try {
            ParcelFileDescriptor o10 = o(uri);
            if (o10 != null) {
                try {
                    if (o10.getFileDescriptor().valid()) {
                        z3 = true;
                    }
                } finally {
                }
            }
            if (o10 != null) {
                o10.close();
            }
        } catch (SecurityException unused) {
        }
        return z3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final OutputStream h(Uri uri) {
        throw new IOException("openForAppend not supported by blobstore");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final void i(Uri uri, Uri uri2) {
        throw new IOException("rename not supported by blobstore");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final void j(Uri uri) {
        throw new IOException("createDirectory not supported by blobstore");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final void k(Uri uri) {
        throw new IOException("deleteDirectory not supported by blobstore");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final OutputStream l(Uri uri) {
        BlobHandle createWithSha256;
        long createSession;
        BlobStoreManager.Session openSession;
        ParcelFileDescriptor openWrite;
        long remainingLeaseQuotaBytes;
        BlobHandle createWithSha2562;
        s.b(uri);
        byte[] c10 = s.c(uri.getPath());
        try {
            if (!uri.getPath().endsWith(".lease")) {
                createWithSha256 = BlobHandle.createWithSha256(c10, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib");
                BlobStoreManager blobStoreManager = this.f14825a;
                createSession = blobStoreManager.createSession(createWithSha256);
                openSession = blobStoreManager.openSession(createSession);
                openSession.allowPublicAccess();
                openWrite = openSession.openWrite(0L, -1L);
                return new o(openWrite, openSession);
            }
            BlobStoreManager blobStoreManager2 = this.f14825a;
            remainingLeaseQuotaBytes = blobStoreManager2.getRemainingLeaseQuotaBytes();
            if (remainingLeaseQuotaBytes > 0) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                String query = uri.getQuery();
                if (!TextUtils.isEmpty(query)) {
                    String queryParameter = uri.getQueryParameter("expiryDateSecs");
                    if (queryParameter != null) {
                        long millis = timeUnit.toMillis(Long.parseLong(queryParameter));
                        createWithSha2562 = BlobHandle.createWithSha256(c10, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib");
                        blobStoreManager2.acquireLease(createWithSha2562, "String description needed for providing a better user experience", millis);
                        return null;
                    }
                    throw new IOException("The uri query is malformed, expected expiryDateSecs=<expiryDateSecs> but found " + query);
                }
                throw new IOException("The uri query is null or empty, expected expiryDateSecs=<expiryDateSecs>");
            }
            throw new RuntimeException("The caller is trying to acquire a lease on too much data.");
        } catch (LimitExceededException e) {
            throw new RuntimeException(e);
        } catch (IllegalStateException e8) {
            throw new IOException("Failed to write into BlobStoreManager", e8);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final Iterable m(Uri uri) {
        throw new IOException("children not supported by blobstore");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final void n(Uri uri) {
        List leasedBlobs;
        byte[] sha256Digest;
        s.b(uri);
        String path = uri.getPath();
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        if (TextUtils.equals(path, "*.lease")) {
            leasedBlobs = this.f14825a.getLeasedBlobs();
            Iterator it = leasedBlobs.iterator();
            while (it.hasNext()) {
                sha256Digest = c2.z1.e(it.next()).getSha256Digest();
                p(sha256Digest);
            }
            return;
        }
        p(s.c(uri.getPath()));
    }

    public final ParcelFileDescriptor o(Uri uri) {
        BlobHandle createWithSha256;
        ParcelFileDescriptor openBlob;
        s.b(uri);
        createWithSha256 = BlobHandle.createWithSha256(s.c(uri.getPath()), "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib");
        openBlob = this.f14825a.openBlob(createWithSha256);
        return openBlob;
    }

    public final void p(byte[] bArr) {
        BlobHandle createWithSha256;
        createWithSha256 = BlobHandle.createWithSha256(bArr, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib");
        try {
            this.f14825a.releaseLease(createWithSha256);
        } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
            throw new IOException("Failed to release the lease", e);
        }
    }
}
