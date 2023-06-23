USE psychologydb;

INSERT INTO `predictions` (`id`, `created_at`, `pred_sopen`, `updated_at`) VALUES (1, '2023-6-23 21:43:31', '4.32', '2023-6-23 21:43:37');
INSERT INTO `ratings` (`id`, `rating`, `created_at`, `updated_at`, `prediction_id`) VALUES (1, '4', '2023-6-23 22:09:07', '2023-6-23 22:09:10', 1);