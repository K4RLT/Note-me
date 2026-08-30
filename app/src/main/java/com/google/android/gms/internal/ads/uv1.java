package com.google.android.gms.internal.ads;

import android.graphics.HardwareRenderer;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.media.MediaCodecInfo;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class uv1 {
    public static /* synthetic */ HardwareRenderer e() {
        return new HardwareRenderer();
    }

    public static /* synthetic */ RenderNode f() {
        return new RenderNode("rootNode");
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint h() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint i(int i, int i10, int i11) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i10, i11);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint j(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession k(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ List l(MediaCodecInfo.VideoCapabilities videoCapabilities) {
        return videoCapabilities.getSupportedPerformancePoints();
    }

    public static /* synthetic */ void m() {
    }

    public static /* bridge */ /* synthetic */ boolean w(MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint2) {
        return performancePoint.covers(performancePoint2);
    }

    public static /* bridge */ /* synthetic */ void z(RecordingCanvas recordingCanvas) {
        recordingCanvas.save();
    }
}
