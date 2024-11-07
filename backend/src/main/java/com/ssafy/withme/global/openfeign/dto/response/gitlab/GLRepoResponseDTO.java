package com.ssafy.withme.global.openfeign.dto.response.gitlab;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public record GLRepoResponseDTO(
        Integer id,
        String node_id,
        String name,
        String full_name,
        GLRepoOwnerDTO owner,
        @JsonProperty("private") Boolean isPrivate,
        String html_url,
        String description,
        Boolean fork,
        String url,
        String archive_url,
        String assignees_url,
        String blobs_url,
        String branches_url,
        String collaborators_url,
        String comments_url,
        String commits_url,
        String compare_url,
        String contents_url,
        String contributors_url,
        String deployments_url,
        String downloads_url,
        String events_url,
        String forks_url,
        String git_commits_url,
        String git_refs_url,
        String git_tags_url,
        String git_url,
        String issue_comment_url,
        String issue_events_url,
        String issues_url,
        String keys_url,
        String labels_url,
        String languages_url,
        String merges_url,
        String milestones_url,
        String notifications_url,
        String pulls_url,
        String releases_url,
        String ssh_url,
        String stargazers_url,
        String statuses_url,
        String subscribers_url,
        String subscription_url,
        String tags_url,
        String teams_url,
        String trees_url,
        String clone_url,
        String mirror_url,
        String hooks_url,
        String svn_url,
        String homepage,
        String language,
        Integer forks_count,
        Integer stargazers_count,
        Integer watchers_count,
        Integer size,
        String default_branch,
        Integer open_issues_count,
        Boolean is_template,
        ArrayList<String> topics,
        Boolean has_issues,
        Boolean has_projects,
        Boolean has_wiki,
        Boolean has_pages,
        Boolean has_downloads,
        Boolean archived,
        Boolean disabled,
        String visibility,
        String pushed_at,
        String created_at,
        String updated_at,
        GLRepoPermissionsDTO permissions,
        Boolean allow_rebase_merge,
        String template_repository,
        String temp_clone_token,
        Boolean allow_squash_merge,
        Boolean allow_auto_merge,
        Boolean delete_branch_on_merge,
        Boolean allow_merge_commit,
        Integer subscribers_count,
        Integer network_count,
        GLRepoLicenseDTO license,
        Integer forks,
        Integer open_issues,
        Integer watchers
    ){
}
