package org.gh4j;

public class Config {
    private Config() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    // Public static final constants
    public static final String API_BASE_URL = "https://api.github.com";
    public static final String API_VERSION_HEADER = "application/vnd.github+json";
    public static final String AUTHORIZATION_HEADER_PREFIX = "Bearer ";
    public static final String DEFAULT_USER_AGENT = "gh4j-library";
    public static final String GITHUB_API_VERSION = "2022-11-28";

    // Example specific endpoint paths
    public static final String ACTIONS_ARTIFACTS_PATH = "/repos/%s/%s/actions/artifacts";
    public static final String ARTIFACT_DOWNLOAD_PATH = "/repos/%s/%s/actions/artifacts/%s/zip";
}