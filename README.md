##Bing Geocoder

This open source JAVA library allows you to integrate [Bing Location API](http://msdn.microsoft.com/en-us/library/ff701715.aspx) into your applications.

The library is compatible with Android.

##Getting Started

* Create your [Bing API Key](http://msdn.microsoft.com/en-us/library/ff428642.aspx).

* Create your requests:
``` java
GeocoderResponse geocoderResponse = new BingGeocoder("[YOUR_BING_API_KEY]")
				// Optional custom logger
				.setLogger(new Logger() {

					@Override
					public boolean isDebugEnabled() {
						return true;
					}

					@Override
					public void e(Throwable arg0) {
					}

					@Override
					public void d(String arg0, Object... arg1) {
					}
				})
				.geocode(new GeocoderRequestBuilder()
								// .setQuery("1 Microsoft Way Redmond WA 98052")
								.setLocation(new LatLng("47.64054", "-122.12934"))
								.setCulture("US")
								.build());
```

##Requirements

* [Gson 2.2.4](https://code.google.com/p/google-gson/downloads/detail?name=google-gson-2.2.4-release.zip&can=2&q=)

## Creators

bing-geocoder was created by [Cristiano Severini](https://github.com/crino/) .

### Credits

[List of contributors](https://github.com/crino/bing-geocoder/graphs/contributors).

##License

Copyright (C) 2014 [Cristiano Severini](https://github.com/crino/)

Distributed under the MIT License.