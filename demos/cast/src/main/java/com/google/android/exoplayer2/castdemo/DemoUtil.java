/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer2.castdemo;

import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Utility methods and constants for the Cast demo application.
 */
/* package */ final class DemoUtil {

  public static final String MIME_TYPE_DASH = MimeTypes.APPLICATION_MPD;
  public static final String MIME_TYPE_HLS = MimeTypes.APPLICATION_M3U8;
  public static final String MIME_TYPE_SS = MimeTypes.APPLICATION_SS;
  public static final String MIME_TYPE_VIDEO_MP4 = MimeTypes.VIDEO_MP4;

  /**
   * The list of samples available in the cast demo app.
   */
  public static final List<Sample> SAMPLES;

  /**
   * Represents a media sample.
   */
  public static final class Sample {

    /**
     * The uri from which the media sample is obtained.
     */
    public final String uri;
    /**
     * A descriptive name for the sample.
     */
    public final String name;
    /**
     * The mime type of the media sample, as required by {@link MediaInfo#setContentType}.
     */
    public final String mimeType;

    /**
     * @param uri See {@link #uri}.
     * @param name See {@link #name}.
     * @param mimeType See {@link #mimeType}.
     */
    public Sample(String uri, String name, String mimeType) {
      this.uri = uri;
      this.name = name;
      this.mimeType = mimeType;
    }

    @Override
    public String toString() {
      return name;
    }

  }

  static {
    // App samples.
    ArrayList<Sample> samples = new ArrayList<>();
//    samples.add(new Sample("http://10.0.32.196:1935/live/thunderstorm-test.stream_360p/playlist.m3u8",
//        "Wowza 360 p private ip", MIME_TYPE_HLS));
//    samples.add(new Sample("http://182.156.94.234:11935/live/thunderstorm-test.stream_360p/playlist.m3u8", "Wowza 360 p public ipWowza 360 p public ip", MIME_TYPE_HLS));
//    samples.add(new Sample("http://tokenauth-i.akamaihd.net/hls/live/264214/tstorm_all/playlist.m3u8", "Akamai HLS push ip(360p)",
//        MIME_TYPE_HLS));
//    samples.add(new Sample("http://ec2-13-250-152-106.ap-southeast-1.compute.amazonaws.com/amagi_hls_data_f175cb1-sunnxt-ktv/CDN/playlist.m3u8", "KTV",
//            MIME_TYPE_HLS));
//    samples.add(new Sample("https://demo-thunderstorm.amagi.com/amagi_hls_data_c6009f0-xumo/CDN/master.m3u8", "XUMO",
//                MIME_TYPE_HLS));
    samples.add(new Sample("http://182.156.94.234:11935/live/thunderstorm-test.stream_360p/playlist.m3u8", "Demo", MIME_TYPE_HLS));


    SAMPLES = Collections.unmodifiableList(samples);

  }

  private DemoUtil() {}

}
